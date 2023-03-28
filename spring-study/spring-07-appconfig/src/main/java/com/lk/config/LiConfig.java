package com.lk.config;

import com.lk.pojo.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component, @Configuration 代表这是一个配置类，就和我们之前看的 beans.xml

@ComponentScan("com.lk.pojo")
@Import(LiConfig2.class)  //相当于将 2  的配置和1合并
public class LiConfig {
    //注册一个bean,相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签的id属性
    //这个方法的返回值，就相当于bean标签中的class属性

    @Bean
    public User getUser(){
        return new User();  //就是返回要注入到bean的对象
    }
}
