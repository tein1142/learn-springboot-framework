package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependecy;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependecy = someDependency;
		System.out.println("All deoendencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependecy.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean Up!");
	}
}

@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
	
}


@Configuration
@ComponentScan
public class PrepostAnnotaionsContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrepostAnnotaionsContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
