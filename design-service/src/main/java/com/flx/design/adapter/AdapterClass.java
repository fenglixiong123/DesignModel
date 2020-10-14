package com.flx.design.adapter;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 16:40
 * @Description: 类适配器
 */
public class AdapterClass extends Source implements Target {

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
