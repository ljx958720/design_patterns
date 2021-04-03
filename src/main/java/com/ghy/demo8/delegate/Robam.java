package com.ghy.demo8.delegate;
//老板
public class Robam {
    public void command(String mission,ITask iTask) throws InstantiationException, IllegalAccessException {
        iTask.doTask(mission);
    }
}
