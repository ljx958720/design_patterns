package com.ghy.demo8.delegate;
//具体任务角色 ConcreteA
public class ConcreteA  implements ITask {
    @Override
    public void doTask(String mission) {
        System.out.println("我是员工A，我的工作是UI");
    }
}
