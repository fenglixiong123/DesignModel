package com.flx.design.singleton;

/**
 * @Author Fenglixiong
 * @Create 2020/9/6 16:51
 * @Description
 **/
public class OutStaticClass {

    static {
        System.out.println("外部类静态块加载时间：" + System.currentTimeMillis());
    }

    public OutStaticClass() {
        System.out.println("外部类构造函数时间：" + System.currentTimeMillis());
    }

    static class InnerStaticClass {
        public static long INNER_STATIC_DATE = System.currentTimeMillis();
        static{
            System.out.println("静态内部类静态块加载时间：" + System.currentTimeMillis());
        }
    }

    class InnerClass {
        public long INNER_DATE = 0;
        public InnerClass() {
            INNER_DATE = System.currentTimeMillis();
            System.out.println("非静态内部类构造函数加载时间："+INNER_DATE);
        }
    }

    public static void main(String[] args) {

        OutStaticClass outStaticClass = new OutStaticClass();
        outStaticClass.new InnerClass();
        System.out.println("静态内部类变量加载时间："+ InnerStaticClass.INNER_STATIC_DATE);
    }

}
