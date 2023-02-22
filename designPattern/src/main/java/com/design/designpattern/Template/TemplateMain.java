package com.design.designpattern.Template;

import com.design.designpattern.Template.domain.AbstractDisplay;
import com.design.designpattern.Template.domain.CharDisplay;
import com.design.designpattern.Template.domain.StringDisplay;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 15:54
 * @Description:
 */
public class TemplateMain {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();

        AbstractDisplay d2 = new StringDisplay("Hello World!");
        d2.display();
    }
}
