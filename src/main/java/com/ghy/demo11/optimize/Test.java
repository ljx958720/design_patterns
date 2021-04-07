package com.ghy.demo11.optimize;

public class Test {
    public static void main(String[] args) {
        TransitionStrategy transitionStrategy=TransitionEnum.newInstance(TransitionEnum.getEnum("doc"));
        transitionStrategy.transform();
    }
}
