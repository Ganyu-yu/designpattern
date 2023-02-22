package com.design.designpattern.Iterator;

import com.design.designpattern.Iterator.domain.Book;
import com.design.designpattern.Iterator.domain.BookShelf;
import com.design.designpattern.Iterator.service.Iterator;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 11:50
 * @Description:
 */
public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("one"));
        bookShelf.appendBook(new Book("two"));
        bookShelf.appendBook(new Book("three"));
        bookShelf.appendBook(new Book("four"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
