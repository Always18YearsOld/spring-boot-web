package com.atguigu.springbootmybatis.service.impl;

import com.atguigu.springbootmybatis.mapper.UserMapper;
import com.atguigu.springbootmybatis.pojo.User;
import com.atguigu.springbootmybatis.pojo.UserExample;
import com.atguigu.springbootmybatis.service.UserService;
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
    private UserMapper userMapper;

    @Override
    @Transactional
    public void addUser(User user) {
        this.userMapper.insert(user);
    }


    @Override
    public List<User> findAllUser(){
        UserExample userExample = new UserExample();
        return this.userMapper.selectByExample(userExample);
    }

    /**
     * 预更新查询
     */
    @Override
    public User findUserById(Integer id){
        UserExample userExample = new UserExample();
        //完了，做不下去了，我这里的mapper里面没有selectByPrimaryKey方法
//        return this.userMapper.selectByExample(id);
        return null;
    }

    /*@Override
    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }*/

    /**
     * 删除用户
     */
    /*@Override
    public void deleteUser(Integer id){
        this.userDao.deleteUser(id);
    }*/
}
