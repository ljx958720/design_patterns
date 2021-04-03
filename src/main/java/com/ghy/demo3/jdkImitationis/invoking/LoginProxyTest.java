package com.ghy.demo3.jdkImitationis.invoking;



public class LoginProxyTest {
    public static void main(String[] args) {
        LoginInterface loginInterface = (LoginInterface)new LoginProxy().getInstance(new Login());
        loginInterface.login("张三");
        loginInterface.reist("张三");

    }
}
