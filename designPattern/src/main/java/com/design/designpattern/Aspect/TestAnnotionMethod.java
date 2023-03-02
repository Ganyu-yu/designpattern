package com.design.designpattern.Aspect;

import com.design.designpattern.Annotion.TestAnnotion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: ganyu
 * @Created: 2023/2/23 15:13
 * @Description:
 */
public class TestAnnotionMethod {
    @Autowired
    private hello h;
    public static void main(String[] args) {
        hello h = new hello();
        String s = h.hello123();

        String s1 = h.hello123();
    }
}
