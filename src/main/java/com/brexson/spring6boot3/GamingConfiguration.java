package com.brexson.spring6boot3;

import com.brexson.spring6boot3.game.GameRunner;
import com.brexson.spring6boot3.game.GamingConsole;
import com.brexson.spring6boot3.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
//    var game = new MarioGame();
//    var game = new SuperContraGame();
//    var game = new PacmanGame(); //1: Object Creation
//    var gameRunner = new GameRunner(game);
//    gameRunner.run();

}
