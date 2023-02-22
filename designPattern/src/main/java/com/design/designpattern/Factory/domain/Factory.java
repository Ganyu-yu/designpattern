package com.design.designpattern.Factory.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 16:45
 * @Description: 工厂生产Product，实际调用create方法， 先生产后注册以完成产品生产
 */
public abstract class Factory {
    public Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);
}
