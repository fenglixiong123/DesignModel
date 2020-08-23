package com.flx.design.strategy.tax;

/**
 * @Author Fenglixiong
 * @Create 2020/8/23 16:10
 * @Description
 **/
public class TaxContext {

    private Tax tax;

    public TaxContext(Tax tax) {
        this.tax = tax;
    }

    public double executeTax(double salary,double bonus){
        return tax.calcTax(salary,bonus);
    }

}
