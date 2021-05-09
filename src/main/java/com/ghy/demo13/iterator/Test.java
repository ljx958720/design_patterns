package com.ghy.demo13.iterator;


public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.add(new Book("A"));
        bookShelf.add(new Book("B"));
        bookShelf.add(new Book("C"));
        bookShelf.add(new Book("D"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
