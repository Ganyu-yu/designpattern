package com.design.designpattern.Singleton;

import com.design.designpattern.Singleton.domain.Singleton;

/**
 * @Author: ganyu
 * @Created: 2023/2/3 13:38
 * @Description:
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        if (s1 == s2) {
            System.out.println("s1与s2是相同的实例");
        } else {
            System.out.println("s1与s2是不同的实例");
        }
    }
}
