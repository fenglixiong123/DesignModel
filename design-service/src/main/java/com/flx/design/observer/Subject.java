package com.flx.design.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者接口
 */
public class Subject {

    //观察者列表
    private List<Observer> observerList = new ArrayList<>();

    @Getter
    private String action;

    public void setAction(String action){
        this.action = action;
        notifyObserver();
    }

    //增加
    public void attach(Observer observer){
        observerList.add(observer);
    }

    //删除
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    //发出通知
    public void notifyObserver(){
        //todo
        observerList.forEach(Observer::update);
    }

}
