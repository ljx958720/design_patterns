package com.ghy.demo3.staticstate;

public class Login implements LoginInterface {

    private static final String TAG = "Login";

    @Override
    public void login(String userName) {
        System.out.println("登录");
    }

    @Override
    public void reist(String userName) {
        System.out.println("注册");

    }
}
