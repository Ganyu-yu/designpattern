package com.design.designpattern.Adapter;

import com.design.designpattern.Adapter.domain.Banner;
import com.design.designpattern.Adapter.domain.Print;
import com.design.designpattern.Adapter.domain.PrintBanner;
import com.design.designpattern.Adapter.domain.PrintBannerBy;

/**
 * @Author: ganyu
 * @Created: 2023/2/2 14:37
 * @Description:
 */
public class AdapterMain {
//    public static void main(String[] args) {
//        Print print = new PrintBanner("haha");
//        print.printWeak();
//        print.printStrong();
//    }

    /**
     * 在这里，使用Print接口来进行编程，将PrintBanner类的实例保存在Print接口里，对Banner类及类里的方法进行隐藏。
     */
    public static void main(String[] args) {
        Print print = new PrintBannerBy("hello");
        print.printWeak();
        print.printStrong();
    }
}
