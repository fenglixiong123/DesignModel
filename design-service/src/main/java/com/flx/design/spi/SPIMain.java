package com.flx.design.spi;

import java.util.ServiceLoader;

/**
 * @Author: Fenglixiong
 * @Date: 2019/4/15 15:28
 * @Description:
 */
public class SPIMain {

    public static void main(String[] args) {
        ServiceLoader<DogService> loads = ServiceLoader.load(DogService.class);
        for(DogService d : loads){
            d.sleep();
        }
    }

}
