package com.flx.design.template.game;

/**
 * @Author Fenglixiong
 * @Create 2020/8/23 15:57
 * @Description
 * 具体的王者荣耀游戏
 **/
public class HonorGame extends Game{
    @Override
    protected void startGame() {
        System.out.println("王者荣耀：启动游戏");
    }

    @Override
    protected void choosePerson() {
        System.out.println("王者荣耀：选择人物");
    }

    @Override
    protected void playGame() {
        System.out.println("王者荣耀：玩游戏");
    }

    @Override
    protected void endGame() {
        System.out.println("王者荣耀：结束游戏");
    }
}
