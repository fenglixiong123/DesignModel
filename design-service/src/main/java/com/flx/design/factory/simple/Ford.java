package com.flx.design.factory.simple;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/15 15:41
 * @Description:
 */
public class Ford extends Car {

    @Override
    protected void start() {
        System.out.println("Ford run...");
    }

    @Override
    protected void stop() {
        System.out.println("Ford stop...");
    }

}
