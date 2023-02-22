package com.design.designpattern.Template.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 15:45
 * @Description: 父类模板
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
