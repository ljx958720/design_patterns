package com.ghy.demo13.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合（ConcreteAggregate）
 * 实现Aggregate接口。实现了Aggregate接口的iterator方法。
  */
public class BookShelf implements Aggregate {

    private List<Book> books;


    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }


    @Override
    public boolean add(Object element) {
        books.add((Book) element);
        return true;
    }
    public int getLength() {
        return books.size();
    }
    @Override
    public boolean remove(Object element) {
        return false;
    }

    /**
     * 方法返回了遍历书架时要用的BookShelfIterator类作为书架的迭代器。当外部要遍历书架时会调用该方法。
     * @return
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
