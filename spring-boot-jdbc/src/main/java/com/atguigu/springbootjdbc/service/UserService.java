package com.atguigu.springbootjdbc.service;

import com.atguigu.springbootjdbc.pojo.User;
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

    @Transactional
    void updateUser(User user);

    void deleteUser(Integer id);
}
