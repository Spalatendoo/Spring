package com.lk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// 等价于xml配置中   <bean id="user" class="com.lk.pojo.User"/>
//component  组件
@Component
@Scope("prototype")
public class User {
    //相当于    <bean id="user" class="com.lk.pojo.User">
    //        <property name="name" value="lk"/>
    //         </bean>   中的<property>标签为name赋值
    @Value("lk")
    public String name;

    @Value("lk")
    public void setName(String name) {
        this.name = name;
    }
}
