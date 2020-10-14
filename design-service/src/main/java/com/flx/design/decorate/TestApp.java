package com.flx.design.decorate;

import com.flx.design.decorate.dress.Man;
import com.flx.design.decorate.dress.ShirtDecorator;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 15:48
 * @Description:
 */
public class TestApp {

    public static void main(String[] args) {

        Man man = new Man();
        ShirtDecorator shirtDecorator = new ShirtDecorator(man);
        shirtDecorator.dress();

    }

}
