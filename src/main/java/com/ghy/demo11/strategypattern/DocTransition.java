package com.ghy.demo11.strategypattern;

/**
 * DOC文档转换
 */
public class DocTransition implements TransitionStrategy{
    @Override
    public void transform() {
        System.out.println("使用DOC文档转换");
    }
}
