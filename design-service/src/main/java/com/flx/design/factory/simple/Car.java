package com.flx.design.factory.simple;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/15 15:39
 * @Description:
 */
public abstract class Car {

    protected abstract void start();

    protected abstract void stop();

    public void run(){
        start();
        stop();
    }

}
