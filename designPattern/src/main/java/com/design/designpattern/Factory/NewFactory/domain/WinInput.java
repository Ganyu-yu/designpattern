package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Input;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:01
 * @Description:
 */
public class WinInput implements Input {
    @Override
    public String write(String text) {
        System.out.println(text);
        return text;
    }
}
