package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

//Component สามารถสร้าง object ได้อัติโนมัติ
@Component
public class PacmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Go up");
	}

	@Override
	public void down() {
		System.out.println("Go down");
	}

	@Override
	public void left() {
		System.out.println("Go left");
	}

	@Override
	public void right() {
		System.out.println("Go right");
	}
	
	public void destroy() {
		System.out.println("You are dead");
	}
}
