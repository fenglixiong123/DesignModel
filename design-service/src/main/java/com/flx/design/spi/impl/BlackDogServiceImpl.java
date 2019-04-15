package com.flx.design.spi.impl;

import com.flx.design.spi.DogService;

/**
 * @Author: Fenglixiong
 * @Date: 2019/4/15 15:25
 * @Description:
 */
public class BlackDogServiceImpl implements DogService {
    public void sleep() {
        System.out.println("黑色Dog,汪汪叫不睡觉！");
    }
}
