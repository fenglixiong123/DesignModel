package com.flx.design.singleton;

import lombok.Data;

/**
 * @Author Fenglixiong
 * @Create 2020/8/31 22:44
 * @Description 饿汉模式-非线程安全
 * 解决线程安全：
 * 1.方法加锁
 * 2.双重检查-可能出现空指针异常（创建的对象中还没有初始化完毕）
 * 3.优雅的方式 holder方式
 * 4.枚举方式
 **/
public class LazySingleton {

    private static volatile Student student;

    /**
     * 加同步锁保证线程安全
     * 但是枷锁会产生效率问题
     * @return
     */
    public synchronized static Student getInstance(){
        if(student==null){
            student = new Student();
        }
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
            System.out.println("I am a student from lazy !");
        }

    }

}
