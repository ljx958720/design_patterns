package com.ghy.demo3.cglibdynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        login("张三");
        Object obj = methodProxy.invokeSuper(o,objects);
        reist("张三");
        return obj;
    }

    public void login(String userName) {
        System.out.println("登录");
    }

    public void reist(String userName) {
        System.out.println("注册");

    }
}
