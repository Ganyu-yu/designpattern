package com.design.designpattern.Factory.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 17:29
 * @Description:
 */
public class TelevisonFactory extends Factory{
    @Override
    public Product createProduct(String name) {
        return new Televison(name);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println("注册" + ((Televison) product).getName() + "电视机");
    }
}
