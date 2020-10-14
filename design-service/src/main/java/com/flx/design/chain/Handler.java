package com.flx.design.chain;

/**
 * @Author: Fenglixiong
 * @Date: 2020/10/14 10:46
 * @Description:
 */
public abstract class Handler {

    //指向下一个处理器
    private Handler next;

    public void setNext(Handler handler){
        this.next = handler;
    }

    public Handler getNext(){
        return this.next;
    }

    protected boolean shouldHandle(){
        return true;
    }

    public void realHandle(){
        if(shouldHandle()){
            handleRequest();
        }
    }

    public abstract void handleRequest();


}
