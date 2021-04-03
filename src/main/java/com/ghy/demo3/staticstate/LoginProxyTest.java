package com.ghy.demo3.staticstate;

public class LoginProxyTest {
    public static void main(String[] args) {
       Login login=new Login();
       LoginProxy loginProxy=new LoginProxy(login);
       loginProxy.reist("张三");
       loginProxy.login("张三");
    }
}
