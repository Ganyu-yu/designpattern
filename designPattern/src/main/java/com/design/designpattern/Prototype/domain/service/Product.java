package com.design.designpattern.Prototype.domain.service;

/**
 * @Author: ganyu
 * @Created: 2023/2/4 16:59
 * @Description:
 */
public interface Product {
    public abstract void use();
    public abstract Product createClone();
}
