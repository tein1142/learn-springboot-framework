package com.int28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentcyConfiguraionContoller {
	
	@Autowired
	private CurrentcyServiceConfiguration configuration;
	
	@RequestMapping("/currentcy-configuration")
	public CurrentcyServiceConfiguration retrieveAllConfiguration(){
		return configuration;
	}
}
