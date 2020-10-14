package com.flx.design.chain;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/14 10:46
 * @Description: 责任链模式
 */
public class TestApp {

    public static void main(String[] args) {

        MyHandler1 h1 = new MyHandler1();
        MyHandler2 h2 = new MyHandler2();
        MyHandler3 h3 = new MyHandler3();

        h1.setNext(h2);
        h2.setNext(h3);

        h1.handleRequest();

    }

}
