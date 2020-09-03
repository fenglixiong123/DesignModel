package com.flx.design.observer;

/**
 * @Author Fenglixiong
 * @Create 2020/9/4 0:47
 * @Description
 **/
public class ObjectClient {

    public static void main(String[] args) {

        final Subject subject = new Subject();

        Observer observerA = new ObserverA("T1",subject);
        Observer observerB = new ObserverB("T2",subject);
        Observer observerC = new ObserverC("T3",subject);

        subject.attach(observerA);
        subject.attach(observerB);
        subject.attach(observerC);

        subject.setAction("准备就绪");
        subject.setAction("开始执行");
        subject.setAction("执行结束");

    }

}
