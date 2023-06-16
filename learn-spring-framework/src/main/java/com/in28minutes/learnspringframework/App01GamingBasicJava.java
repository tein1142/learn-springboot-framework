package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacmanGame();
		var gameRunner = new GameRunner(game3);
		gameRunner.run();

	}

}
