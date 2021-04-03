package com.ghy.demo5.information;
//手机
public class PhoneMessage implements IMessage{
    @Override
    public void send(String content, String name) {
        System.out.println("这是手机逻辑");
    }
}
