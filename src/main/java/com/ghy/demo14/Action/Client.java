package com.ghy.demo14.Action;

/**
 * @author: 卢佳新
 * @version: v1.0
 * @description: com.ghy.demo14.Action
 * @date:2021/6/21 22:24
 * @Motto 不积跬步，无以至千里；不积小流，无以成江海。
 */
public class Client {

    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }

}
