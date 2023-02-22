package com.design.designpattern.Template.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 15:56
 * @Description:
 */
public class StringDisplay extends AbstractDisplay{
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        System.out.println("String：");
    }

    @Override
    public void print() {
        System.out.println(str);
    }

    @Override
    public void close() {
        System.out.println("End");
    }
}
