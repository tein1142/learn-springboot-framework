package com.in28minutes.learnspringframework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class BusinessService{
	private DataService dataServcie;

	
//	@Autowired
	@Inject
	public void setDataServcie(DataService dataServcie) {
		System.out.println("Setter Injection");
		this.dataServcie = dataServcie;
	}
	
	public DataService getDataServcie() {
		return dataServcie;
	}
	
	
}

//@Component
@Named
class DataService{
	
}


@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataServcie());
		}
	}

}
