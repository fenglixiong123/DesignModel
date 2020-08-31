package com.flx.design.single;

import lombok.Data;

/**
 * @Author Fenglixiong
 * @Create 2020/8/31 22:44
 * @Description 饿汉模式-线程安全
 * 占用内存过多
 **/
public class HungrySingleton {

    private static final Student student = new Student();

    public static Student getInstance(){
        return student;
    }

    @Data
    static class Student{

        private Integer id;
        private String name;

        //构造函数私有，防止外部去new实例
        private Student(){

        }

        public void showMessage(){
            System.out.println("I am a student from hungry !");
        }

    }
}
