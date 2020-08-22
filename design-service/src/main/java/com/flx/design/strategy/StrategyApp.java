package com.flx.design.strategy;

import com.flx.design.strategy.calc.CalculateContext;
import com.flx.design.strategy.calc.CalculateStrategy;
import com.flx.design.strategy.calc.policy.OperationAdd;
import com.flx.design.strategy.calc.policy.OperationSub;
import com.flx.design.strategy.tax.TaxCalculator;

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

        TaxCalculator taxCalculator = new TaxCalculator(salary,bonus){
            @Override
            protected double calcTax() {
                return salary*0.1+bonus*0.15;
            }
        };
        System.out.println("1999年应缴纳税费为："+taxCalculator.taxMoney());
    }

}
