package com.design.designpattern.Iterator.service;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 10:56
 * @Description: 迭代器，用于遍历集合中的元素
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
