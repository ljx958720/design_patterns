package com.ghy.demo11.optimize;

/**
 * DOC文档转换
 */
public class DocTransition implements TransitionStrategy {
    @Override
    public void transform() {
        System.out.println("使用DOC文档转换");
    }
}
