package com.ghy.demo8.delegate;

import java.util.HashMap;
import java.util.Map;

//委派者角色 Delegate 经理
public class Delegate implements ITask{
    private Map<String,Class> map=new HashMap<>();

    public Delegate(){
        map.put("UI",ConcreteA.class);
        map.put("开发",ConcreteB.class);
    }
    @Override
    public void doTask(String mission) throws IllegalAccessException, InstantiationException {
        if (!map.containsKey(mission)){
            System.out.println("没有这样的业务员");
            return;
        }
       ITask iTask= (ITask) map.get(mission).newInstance();
        iTask.doTask(mission);

    }
}
