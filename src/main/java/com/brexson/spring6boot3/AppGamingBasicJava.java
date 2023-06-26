package com.brexson.spring6boot3;

import com.brexson.spring6boot3.game.GameRunner;
import com.brexson.spring6boot3.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
