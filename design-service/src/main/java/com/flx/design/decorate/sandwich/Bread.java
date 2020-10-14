package com.flx.design.decorate.sandwich;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 15:52
 * @Description:
 */
public class Bread extends Food{

    private Food food;

    public Bread(Food food) {
        this.food = food;
    }

}
