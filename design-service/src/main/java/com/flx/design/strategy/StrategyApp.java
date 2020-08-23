package com.flx.design.strategy;

import com.flx.design.strategy.calc.CalculateContext;
import com.flx.design.strategy.calc.policy.OperationAdd;
import com.flx.design.strategy.calc.policy.OperationSub;
import com.flx.design.strategy.tax.policy.Tax2008;
import com.flx.design.strategy.tax.policy.Tax2020;
import com.flx.design.strategy.tax.TaxContext;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:33
 * @Description
 **/
public class StrategyApp {

    public static void main(String[] args) {
        calculateOperation();
        calculateTax1999(1000,500);

    }

    /**
     * 计算策略
     */
    private static void calculateOperation(){
        int a = 8,b = 2;
        CalculateContext contextAdd = new CalculateContext(new OperationAdd());
        CalculateContext contextSub = new CalculateContext(new OperationSub());
        System.out.println("a+b =" + contextAdd.executeStrategy(a,b));
        System.out.println("a-b =" + contextSub.executeStrategy(a,b));
    }

    private static void calculateTax1999(final double salary, final double bonus) {

        TaxContext context2008 = new TaxContext(new Tax2008());
        TaxContext context2020 = new TaxContext(new Tax2020());
        System.out.println("2008年应缴纳税费为："+context2008.executeTax(salary,bonus));
        System.out.println("2020年应缴纳税费为："+context2020.executeTax(salary,bonus));

    }

}
