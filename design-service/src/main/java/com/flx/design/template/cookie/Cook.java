package com.flx.design.template.cookie;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:51
 * @Description
 * 定义模板类和程序流程
 * 一般程序流程不可变
 **/
public abstract class Cook {

    //放油
    protected abstract void oil();
    //放鸡蛋
    protected abstract void egg();
    //放西红柿
    protected abstract void tomato();

    /**
     * 封装做饭方法
     */
    final public void cook(){
        this.oil();
        this.egg();
        this.tomato();
    }

}
