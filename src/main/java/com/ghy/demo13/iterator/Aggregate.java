package com.ghy.demo13.iterator;



/**抽象容器:Aggregate 接口
 * 所要便利的集合的接口。实现了该接口的类将成为一个可以保存多个元素的集合，类似数组。
 * Aggregate接口中声明的方法为iterator,作用为生成一个用于遍历的迭代器。
 * @param <E>
 */
public interface Aggregate<E>{
    boolean add(E element);

    boolean remove(E element);
    public abstract Iterator iterator();
}
