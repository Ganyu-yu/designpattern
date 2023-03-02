package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Button;
import com.design.designpattern.Factory.NewFactory.service.GUIFactory;
import com.design.designpattern.Factory.NewFactory.service.Input;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:03
 * @Description:
 */
public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Input createInput() {
        return new WinInput();
    }
}
