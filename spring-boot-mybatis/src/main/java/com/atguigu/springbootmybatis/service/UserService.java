package com.atguigu.springbootmybatis.service;

import com.atguigu.springbootmybatis.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/27
 */
public interface UserService {

    void addUser(User user);

    List<User> findAllUser();

 User findUserById(Integer id);

 /*      @Transactional
    void updateUser(User user);

    void deleteUser(Integer id);*/
}
