package com.design.designpattern.Aspect;

import com.design.designpattern.Annotion.TestAnnotion;
import org.springframework.stereotype.Component;

/**
 * @Author: ganyu
 * @Created: 2023/2/23 15:15
 * @Description:
 */
@Component
public class hello {

    @TestAnnotion
    public static String hello123(){
        System.out.println("hello");
        return "hello";
    }
}
