package com.flx.design.template.cookie;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:56
 * @Description
 **/
public class ChefCook extends Cook {
    @Override
    protected void oil() {
        System.out.println("大厨：放适量油");
    }

    @Override
    protected void egg() {
        System.out.println("大厨：放适量鸡蛋");
    }

    @Override
    protected void tomato() {
        System.out.println("大厨：放适量西红柿");
    }
}
