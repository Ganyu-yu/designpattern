package com.design.designpattern.Singleton.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/3 13:37
 * @Description:
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
