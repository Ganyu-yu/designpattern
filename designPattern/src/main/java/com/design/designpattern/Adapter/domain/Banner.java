package com.design.designpattern.Adapter.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 14:27
 * @Description:
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("(" + str + ")");
    }

    public void showWithAster(){
        System.out.println("*" + str + "*");
    }
}
