package com.design.designpattern.Prototype.domain.domain;

import com.design.designpattern.Prototype.domain.service.Product;

import java.util.HashMap;

/**
 * @Author: ganyu
 * @Created: 2023/2/4 17:01
 * @Description:
 */
public class Manager {
    private HashMap showCase = new HashMap();

    public void register(String name, Product proto){
        showCase.put(name,proto);
    }
}
