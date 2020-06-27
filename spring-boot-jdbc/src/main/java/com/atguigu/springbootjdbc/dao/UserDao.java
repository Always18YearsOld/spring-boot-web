package com.atguigu.springbootjdbc.dao;

import com.atguigu.springbootjdbc.pojo.User;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/27
 */
public interface UserDao {
    void insertUser(User user);

    List<User> selectAllUsers();

    User selectUserById(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);
}
