package com.brexson.spring6boot3;

import com.brexson.spring6boot3.game.GameRunner;
import com.brexson.spring6boot3.game.GamingConsole;
import com.brexson.spring6boot3.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }

    }
}
