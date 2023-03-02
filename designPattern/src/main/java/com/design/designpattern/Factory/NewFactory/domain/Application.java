package com.design.designpattern.Factory.NewFactory.domain;

import com.design.designpattern.Factory.NewFactory.service.Button;
import com.design.designpattern.Factory.NewFactory.service.GUIFactory;
import com.design.designpattern.Factory.NewFactory.service.Input;

/**
 * @Author: ganyu
 * @Created: 2023/2/27 19:05
 * @Description:
 */
public class Application {
    public final GUIFactory guiFactory;
    public final Button button;
    public final Input input;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.button = guiFactory.createButton();
        this.input = guiFactory.createInput();
    }

   public void run(){
        button.paint();
        input.write("haha");
   }
}
