package com.design.designpattern.Adapter.domain;

import com.design.designpattern.Adapter.service.Print;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 14:40
 * @Description: 此类担任设配器的角色，它继承了Banner类，也实现了Print接口
 * 使用 继承 的适配器
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
