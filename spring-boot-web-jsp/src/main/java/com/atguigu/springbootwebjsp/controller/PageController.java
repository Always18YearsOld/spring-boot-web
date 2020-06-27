package com.atguigu.springbootwebjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：ltb
 * @date ：2020/6/25
 */
@Controller
public class PageController {


    @GetMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
