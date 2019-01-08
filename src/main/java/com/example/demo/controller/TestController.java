package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping("/test")
    public @ResponseBody String test(){
        return "ddddddddfff";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello.html";
    }
}
