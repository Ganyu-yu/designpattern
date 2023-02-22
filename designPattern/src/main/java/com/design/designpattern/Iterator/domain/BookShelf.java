package com.design.designpattern.Iterator.domain;

import com.design.designpattern.Iterator.service.Aggregate;
import com.design.designpattern.Iterator.service.Iterator;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 11:00
 * @Description: 表示书架的类，因为此类要作为集合处理，因此实现了Aggregate接口，
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
