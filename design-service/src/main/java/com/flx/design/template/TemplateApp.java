package com.flx.design.template;

import com.flx.design.template.cookie.ChefCook;
import com.flx.design.template.cookie.MeCook;

/**
 * @Author Fenglixiong
 * @Create 2020/8/22 16:57
 * @Description
 **/
public class TemplateApp {

    public static void main(String[] args) {

        cookie();
    }

    /**
     * 定义做饭的一系列规则，由用户来具体实现其中的细节
     */
    public static void cookie(){
        MeCook meCook = new MeCook();
        ChefCook chefCook = new ChefCook();
        meCook.cook();
        chefCook.cook();
    }

}
