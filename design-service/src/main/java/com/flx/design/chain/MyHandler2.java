package com.flx.design.chain;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/14 10:50
 * @Description:
 */
public class MyHandler2 extends Handler {

    @Override
    protected boolean shouldHandle() {
        return true;
    }

    @Override
    public void handleRequest() {
        System.out.println("H2 handler...start");
        try {
            Thread.sleep(1000);
            System.out.println("H2 handler...done");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(this.getNext()!=null) {
            this.getNext().handleRequest();
        }
    }
}
