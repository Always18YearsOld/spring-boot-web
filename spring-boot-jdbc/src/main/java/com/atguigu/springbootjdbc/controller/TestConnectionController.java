package com.atguigu.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;

/**
 * @author ：ltb
 * @date ：2020/6/26
 */
@Controller
public class TestConnectionController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/showInfo")
    public String showInfo(){
        return "ok";
    }
}
