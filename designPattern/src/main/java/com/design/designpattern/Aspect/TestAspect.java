package com.design.designpattern.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: ganyu
 * @Created: 2023/2/23 15:12
 * @Description:
 */
@Component
@Aspect
public class TestAspect {
    @Pointcut("@annotation(com.design.designpattern.Annotion.TestAnnotion)")
    private void cut(){

    }

    @Before("cut()")
    public void before(){
        System.out.println("注解23");
    }

    @After("cut()")
    public void aftermethod(){
        System.out.println("注解生效");
    }
}
