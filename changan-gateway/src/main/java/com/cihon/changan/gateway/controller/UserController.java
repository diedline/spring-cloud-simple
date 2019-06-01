package com.cihon.changan.gateway.controller;


import com.alibaba.fastjson.JSON;
import com.cihon.changan.common.exception.BuzCode;
import com.cihon.changan.common.model.dto.R;
import com.cihon.changan.common.model.vo.TRole;
import com.cihon.changan.common.model.vo.TUser;
import com.cihon.changan.common.util.BASE64Utils;
import com.cihon.changan.common.util.MD5Utils;
import com.cihon.changan.gateway.filter.PrintRequestLogFilter;
import com.cihon.changan.gateway.model.dto.CheckParam;
import com.cihon.changan.gateway.service.IRoleService;
import com.cihon.changan.gateway.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;

@Api(tags = "用户登录管理")
@RequestMapping("index")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PrintRequestLogFilter.class);

    /***
     *  管理员登录接口
     * @param jobNum    工号
     * @param pwd   密码
     * @param tel   电话
     * @param telCode 短信验证码
     * @return {@link R}
     * */
    @RequestMapping("adminLogin")
    @ApiOperation("管理员登陆")
    public R adminLogin(String jobNum, String pwd, String code, HttpServletRequest request, String tel,
                        String telCode, HttpServletResponse res) throws Exception {
        R response = new R();
        // 获取session中的验证码
        if (!getCode(code, request, response)) return response;
        //验证短信 先写死
        if (telCode == null || !telCode.equals("1001")) {
            response.setCode(BuzCode.USER_VERIFICATION_CODE_ERROR.getCode());
            response.setMessage(BuzCode.USER_VERIFICATION_CODE_ERROR.getMessage());
            return response;
        }
        TUser user = userService.findByJobNum(jobNum);
        //user 非空验证
        if (user != null) {

            //登录前   校验用户状态    0 未启用 1 启用  再校验一遍是否是管理员账号
            if (user.getStatus() == 0 || !roleService.findByRoleID(user.getRoleId()).getRoleName().equals("admin")) {
                response.setCode(BuzCode.FAILED.getCode());
                response.setMessage(BuzCode.FAILED.getMessage());
                return response;
            }

            // 第一次登录校验数据库密码是否为空
            if (user.getPassWord().equals("")) {
                //如果是第一次登陆      传给前端的用户密码设置为1
                user.setPassWord("1");
                response.setData(user);
                return response;
            }

            if (!user.getPassWord().equals(MD5Utils.MD5Encode(pwd, "utf-8"))) {
                response.setCode(BuzCode.USER_PWD_ERROR.getCode());
                response.setMessage(BuzCode.USER_PWD_ERROR.getMessage());
                return response;
            }
            LOGGER.info("当前用户是{}", user);
            setProperty(request, res, user);
        }

        response.setData(user);
        return response;
    }


    /**
     * 普通用户登录接口
     * 校验工号 密码 页面验证码
     *
     * @param jobNum  用户名
     * @param pwd     密码
     * @param tel     手机
     * @param code    页面验证码
     * @param telCode 手机验证码
     */
    @RequestMapping("userLogin")
    public R userLogin(String jobNum, String pwd, String code, HttpServletRequest request, String tel,
                       String telCode, HttpServletResponse res) throws UnsupportedEncodingException {
        R response = new R();
        // 获取session中的验证码
        if (getCode(code, request, response)) {
            return getResponse(jobNum, pwd, request, res, response, telCode);
        }
        response.setCode(BuzCode.FAILED.getCode());
        response.setMessage(BuzCode.FAILED.getMessage());
        return response;
    }


    /**
     * 校验该账号是否是管理员并判断是否是第一次登录
     */
    @GetMapping("checkUser")
    @ApiOperation("输入账号校验是否管理员")
    public R checkUser(String jobNum, HttpServletRequest request,
                       HttpServletResponse res) throws Exception {
        //校验参数
        CheckParam checkParam = new CheckParam();
        R r = new R();
        TUser user = userService.findByJobNum(jobNum);
        TRole role = roleService.findByRoleID(user.getRoleId());

        if (role.getRoleName().equals("admin") && user.getStatus() == 1 && user.getPassWord().equals("")) {
            checkParam.setIsFirst(true);
            checkParam.setIsAdmin(true);
            r.setData(checkParam);
            return r;
        } else if (role.getRoleName().equals("admin") && user.getStatus() == 1) {
            checkParam.setIsFirst(false);
            checkParam.setIsAdmin(true);
            r.setData(checkParam);
        } else if (user.getStatus() == 1 && user.getPassWord().equals("")) {
            checkParam.setIsAdmin(false);
            checkParam.setIsFirst(true);
            r.setData(checkParam);
            return r;
        } else if (user.getStatus() == 1) {
            checkParam.setIsFirst(false);
            checkParam.setIsAdmin(false);
            r.setData(checkParam);
            return r;
        } else {
            r.setCode(BuzCode.FAILED.getCode());
            r.setMessage(BuzCode.FAILED.getMessage());
        }
        return r;
    }

    /**
     * 首次登录设置密码
     */
    @RequestMapping("updatePwd")
    @ApiOperation("用户首次登录修改密码接口")
    public R updatePwd(Integer id, String pwd) {
        R response = new R();
        TUser user = new TUser();
        user.setId(id);
        user.setPassWord(MD5Utils.MD5Encode(pwd, "utf-8"));
        if (pwd.length() == 0 || userService.updatePwd(user) == 0) {
            response.setCode(BuzCode.FAILED.getCode());
            response.setMessage(BuzCode.FAILED.getMessage());
        }
        return response;
    }


    /**
     * 用户退出接口
     * 清除用户cookie
     *
     * @return {@link R}
     */
    @RequestMapping("exit")
    @ApiOperation("退出")
    public R exit(HttpServletRequest request, HttpServletResponse res) {

        //销毁cookie
        Cookie[] cookies = request.getCookies();
        if (null == cookies) {
            System.out.println("没有cookie");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    cookie.setValue(null);
                    cookie.setMaxAge(0);// 立即销毁cookie
                    cookie.setPath("/");
                    System.out.println("被删除的cookie名字为:" + cookie.getName());
                    res.addCookie(cookie);
                    break;
                }
            }
        }
        //清除所有session
        Enumeration em = request.getSession().getAttributeNames();
        while (em.hasMoreElements()) {
            request.getSession().removeAttribute(em.nextElement().toString());
        }

        R r = new R();
        r.setData("success");
        return r;
    }


    /**
     * 通过用户账户和密码获取response 和设置session
     */
    private R getResponse(String jobNum, String pwd, HttpServletRequest request,
                          HttpServletResponse res, R response, String telCode) throws UnsupportedEncodingException {
        TUser user = userService.findByJobNum(jobNum);
        if (user != null) {

            //如果用户不存在   或者用户的状态为 0 未启用状态
            if (user.getStatus() == 0) {
                response.setCode(BuzCode.USER_NOT_FOUND.getCode());
                response.setMessage(BuzCode.USER_NOT_FOUND.getMessage());
                return response;
            }
            // 第一次登录校验数据库密码是否为空
            if (user.getPassWord().length() == 0 && telCode.equals("1001")) {
                //第一次登陆 密码返回给前端是1
                user.setPassWord("1");
                response.setData(user);
                LOGGER.info("当前用户是{},第一次登录", user);
                return response;
            }
            //校验密码
            if (!MD5Utils.MD5Encode(pwd, "utf-8").equals(user.getPassWord())) {
                response.setCode(BuzCode.USER_PWD_ERROR.getCode());
                response.setMessage(BuzCode.USER_PWD_ERROR.getMessage());

                return response;
            }
            LOGGER.info("当前用户是{}", user);
            setProperty(request, res, user);
            response.setData(user);
        }
        return response;
    }


    /**
     * 清除敏感数据，设置session cookie
     *
     * @param user {@link TUser}
     */
    private void setProperty(HttpServletRequest request, HttpServletResponse res, TUser user) throws UnsupportedEncodingException {
        //默认返回给前端的密码是 0
        user.setPassWord("0");
        user.setAccessKey("");
        HttpSession session = request.getSession();
        session.setAttribute("session_user", user);
        String sessionID = session.getId();
        if (session.isNew()) {
            System.out.println("session 创建成功,session的id是：" + sessionID);
        } else {
            System.out.println("session 已经存在 session的id是：" + sessionID);
        }

        String json = JSON.toJSONString(user);
        //因为可能出现特殊字符所以用URLEncoder转化下
        Cookie cookie = new Cookie("user", URLEncoder.encode(BASE64Utils.encodeBase64String(json), "utf-8"));
        //设置30分钟过期时间
        cookie.setMaxAge(60 * 60 * 30);
        cookie.setPath("/");
        res.addCookie(cookie);
    }


    /**
     * 校验验证码
     *
     * @param code 用户输入的验证码
     * @return 判断是否成功
     */
    private boolean getCode(String code, HttpServletRequest request, R response) {
        String sessionCode = (String) request.getSession().getAttribute("captcha");
        // 判断验证码
        if (sessionCode == null || code == null || !sessionCode.equals(code.trim().toLowerCase())) {
            response.setMessage(BuzCode.FAILED.getMessage());
            response.setCode(BuzCode.FAILED.getCode());
            return false;
        }
        return true;
    }




}