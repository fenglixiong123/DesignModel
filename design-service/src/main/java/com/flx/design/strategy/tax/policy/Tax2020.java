package com.flx.design.strategy.tax.policy;

import com.flx.design.strategy.tax.TaxStrategy;

/**
 * @Author Fenglixiong
 * @Create 2020/8/23 16:08
 * @Description
 **/
public class Tax2020 implements TaxStrategy {
    @Override
    public double calcTax(double salary, double bonus) {
        return salary*0.1+bonus*0.3;
    }
}
