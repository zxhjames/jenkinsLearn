package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 中间件
 * @description:
 * @author: 占翔昊
 * @create 2021-02-07 18:25
 **/

@RestController
public class http {
    @RequestMapping("/")
    public String SayHello() {
        return "hello jenkins,我是james";
    }
}
