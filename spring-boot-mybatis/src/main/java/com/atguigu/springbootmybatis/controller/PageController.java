package com.atguigu.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：ltb
 * @date ：2020/6/26
 * 页面跳转controller
 */
@Controller
public class PageController {

    /**
     * 页面跳转方法
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
