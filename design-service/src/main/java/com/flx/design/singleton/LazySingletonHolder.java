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
public class LazySingletonHolder {

    private static Student student;

    /**
     * 静态内部类
     * 静态内部类的优点是：外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。
     */
    private static class InstanceHolder{
        private final static Student student = new Student();
    }

    /**
     * 当第一次加载LazySingletonHolder类时并不会初始化instance,
     * 只有在第一次调用LazySingletonHolder的getInstance()时Instance才会被初始化。
     * 因此第一次调用getInstance方法会导致虚拟机加载InstanceHolder类
     * @return
     */
    public static Student getInstance(){
        return InstanceHolder.student;
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
