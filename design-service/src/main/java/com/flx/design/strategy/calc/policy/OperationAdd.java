package com.flx.design.strategy.calc.policy;

import com.flx.design.strategy.calc.CalculateStrategy;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 18:22
 * @Description
 **/
public class OperationAdd implements CalculateStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}
