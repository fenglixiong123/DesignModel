package com.flx.design.strategy;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:33
 * @Description
 **/
public class StrategyModel {

    public static void main(String[] args) {
        PrintMessage p = new PrintMessage() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println(message);
            }
        };

        p.print("hehe");

    }

}
