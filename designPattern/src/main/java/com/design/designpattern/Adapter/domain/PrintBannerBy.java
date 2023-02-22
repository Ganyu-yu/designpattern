package com.design.designpattern.Adapter.domain;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 14:50
 * @Description:
 */
public class PrintBannerBy extends Print {
    private Banner banner;

    public PrintBannerBy(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
