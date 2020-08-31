package com.flx.design.single;

import java.util.stream.IntStream;

/**
 * 单例模式
 */
public class SingletonApp {

    public static void main(String[] args) {

        LazySingleton.Student lazyStudent = LazySingleton.getInstance();
        lazyStudent.showMessage();

        HungrySingleton.Student hungryStudent = HungrySingleton.getInstance();
        hungryStudent.showMessage();

        IntStream.rangeClosed(1,100).forEach(x->new Thread(String.valueOf(x)){
            @Override
            public void run() {
                System.out.println(LazySingletonEnum.getInstance());
            }
        }.start());

    }

}
