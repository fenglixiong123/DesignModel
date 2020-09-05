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
public class LazySingletonDoubleCheck {

    private static volatile Student student;

    /**
     * 好处是减少锁使用次数
     * 第一个线程和第二个线程会争抢锁，然后创建实例
     * 第三个线程来先判断是否为空，发现不为空就不会抢锁了
     * 问题：
     * 可能产生空指针（当第一个线程创建的对象还没有完全初始化完成,就被第二个线程拿去用）
     * 解决：
     * 添加volatile关键字
     * volatile关键字可以保证可见性和有序性，禁止内存进行编译优化
     * 添加此关键字对象创建完成是真正的完成
     *
     * 这里重点讲解下出现为什么会出现空指针异常？
     * 假设LazySingletonDoubleCheck类有两个成员变量
     * private Object object1;
     * private Object object2;
     * private LazySingletonDoubleCheck(){
     *     object1 = new Object();
     *     object2 = new Object();
     * }
     * 当JVM进行指令编译的时候，需要执行下面三部：
     * obj1
     * obj2
     * instance
     * 上面三条指令可以进行重排序
     * 如果先执行给instance分配内存空间，返回instance引用
     * 线程二拿到instance，准备去使用obj2，而此时obj2还未初始化，则出现空指针异常
     * 如果使用volatile关键字则会禁止重排序，会首先执行
     * object1 = new Object();
     * object2 = new Object();
     * 然后执行instance初始化
     * 返回instance引用
     * @return
     */
    public static Student getInstanceDoubleCheck(){
        if(null==student){
            synchronized (LazySingletonDoubleCheck.class){
                if(null==student){
                    student = new Student();
                }
            }
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
