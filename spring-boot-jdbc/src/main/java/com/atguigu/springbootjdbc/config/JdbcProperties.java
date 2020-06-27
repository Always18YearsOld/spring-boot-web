package com.atguigu.springbootjdbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：ltb
 * @date ：2020/6/26
 * JDBC配置信息属性类
 */
@ConfigurationProperties(prefix = "jdbc")//是springboot的注解，不能读取其他配置文件，只能读取springboot的配置文件
public class JdbcProperties {
    private String username;
    private String password;
    private String url;
    private String driverClassName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
