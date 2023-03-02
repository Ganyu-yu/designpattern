package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Button;
import com.design.designpattern.Factory.NewFactory.service.GUIFactory;
import com.design.designpattern.Factory.NewFactory.service.Input;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:04
 * @Description:
 */
public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Input createInput() {
        return new MacInput();
    }
}
