package com.ghy.demo5.information;

public class CommonAbstraction extends Abstraction{
    public CommonAbstraction(IMessage iMessage) {
        super(iMessage);
    }
    //发送消息
    public void send(String content, String name){
        this.iMessage.send(content,name);
        System.out.println("普通消息的处理方式");
    }

}
