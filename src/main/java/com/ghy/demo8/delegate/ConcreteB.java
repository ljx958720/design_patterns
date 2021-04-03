package com.ghy.demo8.delegate;
//具体任务角色 ConcreteB
public class ConcreteB implements ITask {
    @Override
    public void doTask(String mission) {
        System.out.println("我是员工B，我的工作是开发");
    }
}
