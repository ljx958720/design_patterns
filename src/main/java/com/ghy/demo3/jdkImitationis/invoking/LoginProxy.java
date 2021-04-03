package com.ghy.demo3.jdkImitationis.invoking;

import com.ghy.demo3.jdkImitationis.proxy.LjxClassLoader;
import com.ghy.demo3.jdkImitationis.proxy.LjxInvocationHandler;
import com.ghy.demo3.jdkImitationis.proxy.LjxProxy;


import java.lang.reflect.Method;


public class LoginProxy implements LjxInvocationHandler {
    private static final String TAG = "Login";

    private LoginInterface loginInterface;
    private Object object;

    public LoginProxy() {

    }

    public Object getInstance(Object object){
         this.object=object;
         Class<?> clazz=object.getClass();
         return (Object) LjxProxy.newProxyInstance(new LjxClassLoader(),clazz.getInterfaces(),this);
    }
    public LoginProxy(LoginInterface loginInterface){
        this.loginInterface=loginInterface;
    }

    public void login(String userName) {

        System.out.println("调用登录接口的日志方法");
        //loginInterface.login("张三");
    }


    public void reist(String userName) {
        System.out.println("调用注册接口的日志方法");
       // loginInterface.reist(userName);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        login("");
        Object obj = method.invoke(this.object,args);
        reist("张三");
        return object;
    }
}
