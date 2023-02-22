package com.design.designpattern.Template.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 15:49
 * @Description:
 */
public class CharDisplay extends AbstractDisplay{
    private char r;
    public CharDisplay(char r) {
        this.r = r;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(r);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
