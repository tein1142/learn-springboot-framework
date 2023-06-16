package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
		}
//		var game1 = new MarioGame();
//		var game2 = new SuperContraGame();
//		var game3 = new PacmanGame();
//		var gameRunner = new GameRunner(game3);
//		gameRunner.run();

	}

}