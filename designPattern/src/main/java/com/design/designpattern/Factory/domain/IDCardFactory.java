package com.design.designpattern.Factory.domain;

import java.security.acl.Owner;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 16:53
 * @Description:
 */
public class IDCardFactory extends Factory {
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println("注册" + ((IDCard) product).getOwner() + "的ID卡");
    }
}
