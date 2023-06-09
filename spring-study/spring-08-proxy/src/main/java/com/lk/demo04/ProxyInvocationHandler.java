package com.lk.demo04;

import com.lk.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[] { Foo.class },
//            handler);

    //被代理的接口
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }

    //得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
//代理中添加执行一个日志方法
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");

    }
}
