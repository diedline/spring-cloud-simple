package com.cihon.changan.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
        //@RestController
public class TemplateController {

//@RequestMapping("/helloHtml")
        @GetMapping("/helloHtml")
public String helloHtml(){
        return "/index";
        }
}