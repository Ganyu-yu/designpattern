package com.design.designpattern.Iterator.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 10:58
 * @Description:
 */
public class Book {
    public Book(String bookName){
        this.name = bookName;
    }
    private String name;

    public String getName() {
        return name;
    }
}
