package com.flx.design.factory.simple;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/15 16:28
 * @Description:
 */
public class TestApp {

    public static void main(String[] args) {

        Car car = SimpleFactory.getCarInstance("DarZhone");
        car.run();

    }

}
