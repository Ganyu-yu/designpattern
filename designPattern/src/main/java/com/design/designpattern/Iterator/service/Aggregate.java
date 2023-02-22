package com.design.designpattern.Iterator.service;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 10:52
 * @Description: 表示遍历集合的接口，实现该接口的类将成为可以保存多个元素的集合。例如例子中的书架。
 */
public interface Aggregate {
    public abstract Iterator iterator(); //用于生成一个用于遍历集合的迭代器。
    // 想要遍历集合中的元素时，可以调用iterator方法生成一个实现了Iterator接口的类
}
