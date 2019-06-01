package com.cihon.changan.gateway.filter;


import com.alibaba.fastjson.JSON;
import com.cihon.changan.common.model.vo.TMenu;
import com.cihon.changan.common.model.vo.TUser;
import com.cihon.changan.gateway.service.IMenuService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
/**
 * 实现 ip校验
 *
 * */
@Component
public class PreFilter extends ZuulFilter {

    Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    IMenuService menuService;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx= RequestContext.getCurrentContext();
        HttpServletRequest req=ctx.getRequest();
        String ipAddr=this.getIpAddr(req);
        logger.info("请求IP地址为：[{}]",ipAddr);
        //配置本地IP白名单，生产环境可放入数据库或者redis中
        List<String> ips=new ArrayList<String>();
        ips.add(ipAddr);



        if(!ips.contains(ipAddr)){
            logger.info("IP地址校验不通过！！！");
            ctx.setResponseStatusCode(401);
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("IpAddr is forbidden!");
        }
        logger.info("IP校验通过。");

        HttpServletRequest request = ctx.getRequest();
        TUser user = (TUser) request.getSession().getAttribute("session_user");
        try {
            ctx.addZuulRequestHeader("user", URLEncoder.encode(JSON.toJSONString(user),"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        /** 在这里做登陆限制  获取用户的role_id 来获取数据库表中的 t_auth_menu 中的 menu_id
         *  再通过menu_id 来获取 t_menu表中的 menu对象
         * */
        List<TMenu> menuList = menuService.getMenu(user.getRoleId());
        List<String> urlList = new ArrayList<>();

        for (TMenu menu:menuList
             ) {
            urlList.add(menu.getLink());
        }
        if(!urlList.contains(request.getRequestURI())){
            logger.info("权限校验不通过！！！");
            ctx.setResponseStatusCode(401);
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("您没有该权限");
        }

        return null;
    }

    /**
     * 获取Ip地址
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request){

        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
