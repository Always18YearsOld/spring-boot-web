package com.atguigu.springbootmybatis.controller;

import com.atguigu.springbootmybatis.pojo.User;
import com.atguigu.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户
     */
    @PostMapping("/addUser")
    public String addUser(User user){
        try{
            this.userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /**
     * 查询全部用户
     * @author: ltb
     * @date 2020/6/28
     * @params
     * @return
     *
     */
    @GetMapping("/findAllUsers")
    public String findAllUsers(Model model) {
        List<User> list = null;
        try{
            list = this.userService.findAllUser();
            model.addAttribute("list",list);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }

    /**
     * 预更新用户的查询
     * @author: ltb
     * @date 2020/6/28
     * @params
     * @return
     *
     */
    @GetMapping("/preUpdateUser")
    public String preUpdateUser(Model model, Integer id){
        try{
            User user = this.userService.findUserById(id);
            model.addAttribute("user",user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }


    /**
     * 修改用户
     * @author: ltb
     * @date 2020/6/28
     * @params
     * @return
     *
     */
    /*@PostMapping("/updateUser")
    public String updateUser(User user){
        try{
            this.userService.updateUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(Integer id){
        try{
            this.userService.deleteUser(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/user/findAllUsers";
    }*/
}
