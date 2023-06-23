package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Spring-boot","Pantavit"));
		System.out.println(repository.findById(1));
		
		repository.deleteById(1);
		System.out.println(repository.findById(1));
		
		
		repository.insert(new Course(2,"Devops","Pantavit"));
		System.out.println(repository.findById(2));
	}

}
