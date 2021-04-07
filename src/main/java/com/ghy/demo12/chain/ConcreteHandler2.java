package com.ghy.demo12.chain;
//具体处理者角色2
public class ConcreteHandler2  extends Handler {
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("到了处理者2这边没有人处理该请求！");
            }
        }
    }
}
