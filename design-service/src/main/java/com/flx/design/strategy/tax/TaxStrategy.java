package com.flx.design.strategy.tax;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 18:04
 * @Description
 *
 * 税率计算器
 * 国家会每年发布一个新版税率
 * 通过升级税率方法来免于代码修改
 **/
public interface TaxStrategy {

    double calcTax(double salary,double bonus);

}
