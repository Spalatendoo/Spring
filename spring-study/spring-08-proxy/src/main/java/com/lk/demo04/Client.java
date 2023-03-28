package com.lk.demo04;

import com.lk.demo02.UserService;
import com.lk.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色，还不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);  //设置要代理的对象

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();

    }
}
