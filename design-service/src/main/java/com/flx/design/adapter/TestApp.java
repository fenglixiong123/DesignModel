package com.flx.design.adapter;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 16:13
 * @Description: Source中没有method2方法但是客户希望有，所以需要一个适配器来完成
 */
public class TestApp {

    public static void main(String[] args) {

        //类适配器
        AdapterClass adapterClass = new AdapterClass();
        adapterClass.method1();
        adapterClass.method2();

        //对象适配器
        AdapterObject adapterObject = new AdapterObject(new Source());
        adapterObject.method1();
        adapterObject.method2();

    }

}
