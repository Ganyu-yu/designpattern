package com.design.designpattern.Annotion;

import java.lang.annotation.*;

/**
 * @Author: ganyu
 * @Created: 2023/2/23 15:11
 * @Description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotion {
}
