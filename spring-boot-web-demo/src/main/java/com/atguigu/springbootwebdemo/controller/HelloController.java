package com.atguigu.springbootwebdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：ltb
 * @date ：2020/6/24
 */
@RestController
public class HelloController {


    @RequestMapping(value = "/hello")
    public String hello(){
        return "index1.html";
    }
}
