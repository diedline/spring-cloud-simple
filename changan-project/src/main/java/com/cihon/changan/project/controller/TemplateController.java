package com.cihon.changan.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@RestController
public class TemplateController {

    @GetMapping("/helloHtml")
    public String helloHtml() {
        return "/index";
    }

    @GetMapping("backOrder")
    public String backOrder() {
        return "/backOrder";
    }

    @GetMapping("backUser")
    public String backUser() {
        return "/backUser";
    }

    @GetMapping("backStat")
    public String backStat() {
        return "/backStat";
    }
}