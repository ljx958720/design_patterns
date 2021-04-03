package com.ghy.demo3.staticstate;

public class LoginProxy implements LoginInterface{
    private static final String TAG = "Login";

    private LoginInterface loginInterface;

    public LoginProxy(LoginInterface loginInterface){
        this.loginInterface=loginInterface;
    }


    @Override
    public void login(String userName) {
        System.out.println("调用登录接口的日志方法");
        loginInterface.login(userName);
    }

    @Override
    public void reist(String userName) {
        System.out.println("调用注册接口的日志方法");
        loginInterface.reist(userName);
    }
}
