package com.flx.design.template.cookie;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:54
 * @Description
 **/
public class MeCook extends Cook{
    @Override
    protected void oil() {
        System.out.println("自己：放十斤油");
    }

    @Override
    protected void egg() {
        System.out.println("自己：放一个鸡蛋");
    }

    @Override
    protected void tomato() {
        System.out.println("自己：放十个西红柿");
    }
}
