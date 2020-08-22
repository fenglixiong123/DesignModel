package com.flx.design.strategy.calc;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 18:24
 * @Description
 * 定义一个环境角色，给客户端使用来选择策略
 **/
public class CalculateContext {

    private CalculateStrategy calculateStrategy;

    public CalculateContext(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int executeStrategy(int a,int b){
        return calculateStrategy.doOperation(a,b);
    }

}
