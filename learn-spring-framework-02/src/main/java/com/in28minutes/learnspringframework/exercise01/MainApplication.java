package com.in28minutes.learnspringframework.exercise01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MainApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(MainApplication.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
