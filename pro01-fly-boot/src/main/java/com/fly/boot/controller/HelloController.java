package com.fly.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fly
 * @Date: 2023-02-07 9:26
 * @Description: 第一次 使用 spring boot
 */

// @Controller + @ResponseBody = @RestController
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot! 你好,spring boot";
    }

    @RequestMapping("/html")
    public String html() {
        return "<ph1>Spring</h1><p>spring boot 的基本使用</>";
    }
}
