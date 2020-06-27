package com.atguigu.springbootjdbc.service.impl;

import com.atguigu.springbootjdbc.dao.UserDao;
import com.atguigu.springbootjdbc.pojo.User;
import com.atguigu.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.insertUser(user);
    }


    @Override
    public List<User> findAllUser(){
        return this.userDao.selectAllUsers();
    }

    /**
     * 预更新查询
     */
    @Override
    public User findUserById(Integer id){
        return this.userDao.selectUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    /**
     * 删除用户
     */
    @Override
    public void deleteUser(Integer id){
        this.userDao.deleteUser(id);
    }
}
