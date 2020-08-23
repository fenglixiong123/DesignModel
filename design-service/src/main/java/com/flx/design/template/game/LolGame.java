package com.flx.design.template.game;

/**
 * @Author Fenglixiong
 * @Create 2020/8/23 15:56
 * @Description
 * 英雄联盟游戏
 **/
public class LolGame extends Game{
    @Override
    protected void startGame() {
        System.out.println("英雄联盟：启动游戏");
    }

    @Override
    protected void choosePerson() {
        System.out.println("英雄联盟：选择人物");
    }

    @Override
    protected void playGame() {
        System.out.println("英雄联盟：玩游戏");
    }

    @Override
    protected void endGame() {
        System.out.println("英雄联盟：结束游戏");
    }
}
