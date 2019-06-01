package com.cihon.changan.gateway.controller;

import com.cihon.changan.common.exception.BuzCode;
import com.cihon.changan.common.model.dto.R;
import com.wf.captcha.Captcha;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

@Controller
public class MainController {

    @RequestMapping("/images/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 设置请求头为输出图片类型
        CaptchaUtil.setHeader(response);

        // 三个参数分别为宽、高、位数
        GifCaptcha gifCaptcha = new GifCaptcha(130, 48, 5);

        // 设置字体
        gifCaptcha.setFont(new Font("Verdana", Font.PLAIN, 32));  // 有默认字体，可以不用设置

        // 设置类型，纯数字、纯字母、字母数字混合
        gifCaptcha.setCharType(Captcha.TYPE_ONLY_NUMBER);

        // 验证码存入session
        request.getSession().setAttribute("captcha", gifCaptcha.text().toLowerCase());

        // 输出图片流
        gifCaptcha.out(response.getOutputStream());
    }

}