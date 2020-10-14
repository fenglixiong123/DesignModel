package com.flx.design.decorate.sandwich;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/13 15:50
 * @Description:
 */
public class Food {

    private String name;

    public Food(){

    }

    public Food(String name) {
        this.name = name;
    }

    public String make(){
        return name;
    }

}
