package com.design.designpattern.Factory;

import com.design.designpattern.Factory.domain.Factory;
import com.design.designpattern.Factory.domain.IDCardFactory;
import com.design.designpattern.Factory.domain.Product;
import com.design.designpattern.Factory.domain.TelevisonFactory;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 16:55
 * @Description:
 */
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");

        card1.use();
        card2.use();

        Factory factory2 = new TelevisonFactory();
        Product tv1 = factory2.create("TCL");
        tv1.use();
    }
}
