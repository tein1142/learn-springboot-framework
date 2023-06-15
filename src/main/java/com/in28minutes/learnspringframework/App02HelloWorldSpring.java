package com.in28minutes.learnspringframework;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. Configure the things that we want Spring manage-
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		
		//App01GamingBasicJava.java
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));
//		System.out.println(context.getBean(Person.class));
//		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person5Qualifier"));
		
		
		//print all the bean name
//		System.out.println("Print all the bean name");
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
