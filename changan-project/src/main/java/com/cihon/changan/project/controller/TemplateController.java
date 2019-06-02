package com.cihon.changan.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
        //@RestController
public class TemplateController {

//@RequestMapping("/helloHtml")
        @GetMapping("/helloHtml")
public String helloHtml(Map<String,Object> map){
        map.put("hello","你好");
        return "/index";
        }
}