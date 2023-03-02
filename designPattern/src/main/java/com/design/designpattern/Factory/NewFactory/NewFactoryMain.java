package com.design.designpattern.Factory.NewFactory;

import com.design.designpattern.Factory.NewFactory.domain.Application;
import com.design.designpattern.Factory.NewFactory.domain.WinGUIFactory;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:08
 * @Description:
 */
public class NewFactoryMain {
    public static void main(String[] args) {
        Application app;
        app = new Application(new WinGUIFactory());
        app.run();
    }
}
