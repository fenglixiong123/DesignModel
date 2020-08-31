package com.flx.design.single;

import lombok.Data;
import org.apache.commons.lang3.RandomUtils;


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
public class LazySingletonEnum {

    private static volatile Student student;

    /**
     * 枚举类型是线程安全的
     * 构造函数只会被装载一次
     */
    private enum Singleton{

        INSTANCE;

        private final Student student;

        Singleton(){
            student = new Student();
            student.setId(RandomUtils.nextInt());
            student.setName(RandomUtils.nextInt()+"");
        }

        public Student getStudent(){
            return student;
        }

    }

    public static Student getInstance(){
        return Singleton.INSTANCE.getStudent();
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
