package com.atguigu.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author ：ltb
 * @date ：2020/6/26
 * 数据源的JDBC配置类
 */
@Configuration
//@PropertySource("classpath:/jdbc.properties")   //加载指定的Properties配置文件
@EnableConfigurationProperties(JdbcProperties.class)    //指定加载哪个配置信息属性类
public class JdbcConfiguration {

    @Autowired
    private JdbcProperties jdbcProperties;


    /*@Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;*/
    /**
     * 实例化Druid
     */
    /*@Bean
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setUsername(this.username);
        source.setPassword(this.password);
        source.setUrl(this.url);
        source.setDriverClassName(this.driverClassName);
        return source;
    }*/

    @Bean
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setUsername(this.jdbcProperties.getUsername());
        source.setPassword(this.jdbcProperties.getPassword());
        source.setUrl(this.jdbcProperties.getUrl());
        source.setDriverClassName(this.jdbcProperties.getDriverClassName());
        return source;
    }
}
