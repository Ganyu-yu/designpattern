package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Button;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:01
 * @Description:
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac UI Button Create");
    }
}
