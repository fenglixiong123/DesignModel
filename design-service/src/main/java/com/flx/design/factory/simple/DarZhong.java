package com.flx.design.factory.simple;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/15 15:41
 * @Description:
 */
public class DarZhong extends Car{

    @Override
    protected void start() {
        System.out.println("DarZhong run...");
    }

    @Override
    protected void stop() {
        System.out.println("DarZhong stop...");
    }

}
