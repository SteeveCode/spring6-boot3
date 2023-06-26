package com.brexson.spring6boot3;

import com.brexson.spring6boot3.game.GameRunner;
import com.brexson.spring6boot3.game.MarioGame;
import com.brexson.spring6boot3.game.PacmanGame;
import com.brexson.spring6boot3.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//      var game = new MarioGame();
//      var game = new SuperContraGame();
        var game = new PacmanGame(); //1: Object Creation
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
