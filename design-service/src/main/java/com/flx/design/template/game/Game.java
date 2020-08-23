package com.flx.design.template.game;

/**
 * @Author Fenglixiong
 * @Create 2020/8/23 15:52
 * @Description
 * 采用模板模式
 * 定义好玩游戏的步骤
 **/
public abstract class Game {

    //启动游戏
    protected abstract void startGame();
    //选择人物
    protected abstract void choosePerson();
    //开始玩游戏
    protected abstract void playGame();
    //结束游戏
    protected abstract void endGame();

    /**
     * 游戏模板
     */
    public final void play(){
        startGame();
        choosePerson();
        playGame();
        endGame();
    }

}
