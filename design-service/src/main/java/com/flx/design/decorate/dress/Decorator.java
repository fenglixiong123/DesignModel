package com.flx.design.decorate.dress;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/14 14:57
 * @Description:
 */
public abstract class Decorator {

    protected Person person;

    public Decorator(Person person){
        this.person = person;
    }

    public abstract void dress();

}
