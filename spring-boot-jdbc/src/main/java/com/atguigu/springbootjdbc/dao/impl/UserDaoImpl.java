package com.atguigu.springbootjdbc.dao.impl;

import com.atguigu.springbootjdbc.dao.UserDao;
import com.atguigu.springbootjdbc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/6/27
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "insert into user(username,usersex) values(?,?)";
        this.jdbcTemplate.update(sql, user.getUsername(), user.getUsersex());
    }


    @Override
    public List<User> selectAllUsers() {
        String sql = "select * from user";
        /*
         * 做结果集的映射
         */
        /*return this.jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }
        });*/
        /*lambda表达式*/
        return this.jdbcTemplate.query(sql, (resultSet, i) -> {
            User user = new User();
            user.setUserid(resultSet.getInt("userid"));
            user.setUsername(resultSet.getString("username"));
            user.setUsersex(resultSet.getString("usersex"));
            return user;
        });
    }


    /**
     * 预更新用户查询
     *
     * @return
     * @author: ltb
     * @date 2020/6/27
     * @params
     */
    @Override
    public User selectUserById(Integer id) {
        User user = new User();
        String sql = "select * from user where userid = ?";
        /*this.jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

            }
        });*/
        /*lambda表达式*/
        /*这种没有绑定sql语句中问号的参数*/
        /*this.jdbcTemplate.query(sql, resultSet -> {
            user.setUserid(resultSet.getInt("userid"));
            user.setUsername(resultSet.getString("username"));
            user.setUsersex(resultSet.getString("usersex"));
        });*/
        Object[] arr = new Object[]{id};
        this.jdbcTemplate.query(sql, arr, resultSet -> {
            user.setUserid(resultSet.getInt("userid"));
            user.setUsername(resultSet.getString("username"));
            user.setUsersex(resultSet.getString("usersex"));
        });
        return user;
    }


    @Override
    public void updateUser(User user) {
        String sql = "update user set username = ?, usersex = ? where userid = ?";
        this.jdbcTemplate.update(sql, user.getUsername(), user.getUsersex(), user.getUserid());
    }

    @Override
    public void deleteUser(Integer id) {
        String sql = "delete from user where userid = ?";
        this.jdbcTemplate.update(sql, id);
    }
}
