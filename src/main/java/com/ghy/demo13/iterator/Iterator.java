package com.ghy.demo13.iterator;



/**抽象迭代器:Iterator 接口
 *作用为遍历集合中元素，相当于循环语句中的循环变量（for(int i =0 ;i<arr.lenth;i++）,
 * 具体实现一个顺序遍历的迭代器。
 * hasNext() 方法判断是否存在下一个,next()方法获取下一个元素。
 * next方法在获取元素的同时，要将计数器向下一个元素的计数加一。获取的是当前元素，并指向下一个元素。
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
