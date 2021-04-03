package com.ghy.demo3.jdkImitationis.proxy;

import java.lang.reflect.Method;

public interface LjxInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
