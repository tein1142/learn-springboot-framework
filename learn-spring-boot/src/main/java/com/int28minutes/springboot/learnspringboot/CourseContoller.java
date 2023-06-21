package com.int28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseContoller {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCoueses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "Pantavit"),
				new Course(2, "Learn DevOps", "Pantavit"),
				new Course(3, "Learn Azure", "Pantavit"),
				new Course(3, "Learn GCP", "Pantavit")
				);
	}
}
