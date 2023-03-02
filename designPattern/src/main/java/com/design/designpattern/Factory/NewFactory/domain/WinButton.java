package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Button;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:00
 * @Description:
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win UI Button Create");
    }
}
