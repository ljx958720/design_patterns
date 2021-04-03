package com.ghy.demo5.information;

public class UrgencyAbstraction extends Abstraction{
    public UrgencyAbstraction(IMessage iMessage) {
        super(iMessage);
    }
    //发送消息
    public void send(String content, String name){
        this.iMessage.send(content,name);
        System.out.println("紧急消息的处理方式");
    }

}
