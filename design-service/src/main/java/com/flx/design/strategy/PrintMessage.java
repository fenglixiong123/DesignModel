package com.flx.design.strategy;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:35
 * @Description
 **/
public abstract class PrintMessage {

    public final void print(String message){

        System.out.println("---------");
        wrapPrint(message);
        System.out.println("---------");

    }

    protected abstract void wrapPrint(String message);

}
