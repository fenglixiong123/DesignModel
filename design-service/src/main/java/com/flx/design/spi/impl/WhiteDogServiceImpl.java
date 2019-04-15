package com.flx.design.spi.impl;

import com.flx.design.spi.DogService;

/**
 * @Author: Fenglixiong
 * @Date: 2019/4/15 15:26
 * @Description:
 */
public class WhiteDogServiceImpl implements DogService {
    public void sleep() {
        System.out.println("白色Dog,呼呼大睡！");
    }
}
