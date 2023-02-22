package com.design.designpattern.Iterator.domain;

import com.design.designpattern.Iterator.service.Iterator;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 11:38
 * @Description: 遍历书架的类，因为要发挥迭代器的作用，因此实现Iterator接口，
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index; //表示迭代器当前指到书架的下标

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
