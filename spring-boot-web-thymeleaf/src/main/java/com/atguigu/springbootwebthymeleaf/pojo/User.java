package com.atguigu.springbootwebthymeleaf.pojo;

import lombok.Data;

/**
 * @author ：ltb
 * @date ：2020/6/25
 */
@Data
public class User {
    private String id;
    private String name;
    private Integer age;

    public User(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
