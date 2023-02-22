package com.design.designpattern.Factory.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 16:50
 * @Description:
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
