package com.atguigu.springbootwebthymeleaf.controller;

import com.atguigu.springbootwebthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author ：ltb
 * @date ：2020/6/25
 * 传输数据
 */
@Controller
public class ThymeleafController {

    @GetMapping("/show")
    public String showPage(Model model) {
        model.addAttribute("msg", "Hello Thymeleaf");
        model.addAttribute("date", new Date());
        model.addAttribute("sex", "男");
        model.addAttribute("id", 5);
        List<User> list = new ArrayList<>();
        list.add(new User("1", "zhangsan", 23));
        list.add(new User("2", "lisi", 24));
        list.add(new User("3", "wangwu", 25));
        list.add(new User("4", "zhaoliu", 26));
        model.addAttribute("list", list);
        Map<String, User> map = new HashMap<>();
        map.put("user1", new User("1", "zhangsan", 23));
        map.put("user2", new User("2", "lisi", 24));
        map.put("user3", new User("3", "wangwu", 25));
        map.put("user4", new User("4", "zhaoliu", 26));
        model.addAttribute("map", map);
        model.addAttribute("id", "100");
        model.addAttribute("name", "liuyifei");
        return "index";
    }

    @GetMapping("/showRequest")
    public String showPage(HttpServletRequest request) {
        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("ses", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "application");
        return "servletRequest";
    }

    @GetMapping("/show2")
    public String show2(String id, String name) {
        System.out.println(id + "\t" + name);
        return "param";
    }

    @GetMapping("/restful1/{id}")
    public String restful1(@PathVariable String id) {
        System.out.println(id);
        return "param";
    }

    @GetMapping("/restful2/{id}/{name}")
    public String restful2(@PathVariable String id, @PathVariable String name) {
        System.out.println(id + "\t" + name);
        return "param";
    }

    @GetMapping("/restful3/{id}")
    public String restful3(@PathVariable String id, String name) {
        System.out.println(id + "\t" + name);
        return "param";
    }

    @GetMapping("/restful4/{id}")
    public String restful4(@PathVariable String id, String name) {
        System.out.println(id + "\t" + name);
        return "param";
    }


}
