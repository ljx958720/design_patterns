package com.ghy.demo11.strategypattern;

/**
 * dwg转换
 */
public class DwgTransition implements TransitionStrategy{
    @Override
    public void transform() {
        System.out.println("使用dwg转换");
    }
}
