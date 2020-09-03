package com.flx.design.observer;

/**
 * @Author Fenglixiong
 * @Create 2020/9/4 0:41
 * @Description
 **/
public class ObserverC extends Observer{

    public ObserverC(String name,Subject subject) {
        super(name,subject);
    }

    @Override
    public void update() {
        System.out.println(name+" receive action "+subject.getAction());
    }

}
