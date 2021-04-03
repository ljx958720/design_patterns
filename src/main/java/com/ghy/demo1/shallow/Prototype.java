package com.ghy.demo1.shallow;

/**
 * 抽象原型（Prototype）:规定拷贝接口
 */
public interface Prototype<T> {
    T clone();
}
