package com.flx.design.adapter;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 16:48
 * @Description: 对象适配器
 */
public class AdapterObject implements Target {

    private Source source;

    public AdapterObject(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
