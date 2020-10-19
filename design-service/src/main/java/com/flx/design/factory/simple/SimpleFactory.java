package com.flx.design.factory.simple;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/15 15:43
 * @Description:
 */
public class SimpleFactory {

    public static Car getCarInstance(String type){
        Car car;
        switch (type){
            case "DarZhong":
                car = new DarZhong();
                break;
            case "Ford":
                car = new Ford();
                break;
            default:
                car = null;
        }
        return car;
    }

}
