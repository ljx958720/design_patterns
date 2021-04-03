package com.ghy.demo5.information;

public abstract class Abstraction {
     IMessage iMessage;

    public Abstraction(IMessage iMessage){
        this.iMessage=iMessage;
    }

    //发送消息
    public void send(String content, String name){
        this.iMessage.send(content,name);
    }
}
