package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {

	@Bean
	@Primary
	public GamingConsole pacmanGame() {
		return new PacmanGame();
	}

	@Bean
	public GamingConsole marioGame() {
		return new MarioGame();
	}

	@Bean
	public GamingConsole superContraGame() {
		return new SuperContraGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
