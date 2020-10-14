package com.flx.design.decorate.dress;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/14 14:59
 * @Description:
 */
public class ShirtDecorator extends Decorator {

    public ShirtDecorator(Person person) {
        super(person);
    }

    protected void dressShirt(){
        System.out.println("dress shirt...");
    }

    @Override
    public void dress() {
        person.dress();
        dressShirt();
    }
}
