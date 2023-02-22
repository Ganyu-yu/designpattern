package com.design.designpattern.Factory.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 17:29
 * @Description:
 */
public class Televison extends Product{
    private String name;

    public Televison(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("使用" + name + "电视机");
    }

    public String getName() {
        return name;
    }
}
