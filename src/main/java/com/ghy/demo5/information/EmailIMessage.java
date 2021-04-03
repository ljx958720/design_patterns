package com.ghy.demo5.information;
//邮箱
public class EmailIMessage implements IMessage{
    @Override
    public void send(String content, String name) {
        System.out.println("这是邮箱的逻辑");
    }
}
