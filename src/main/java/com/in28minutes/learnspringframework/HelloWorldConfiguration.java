package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Person name & age
record Person(String name, int age, Address address) {
};

//Address firstLine & City
record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Tien";
	}

	@Bean
	public Integer age() {
		return 22;
	}

	@Bean
	public Person person() {
		return new Person("Tien", 22, new Address("Itsaraprap 38", "Bangkok"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name(), age(), adress()
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {//name,age,adress2
		return new Person(name(), age(), address3); 
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Itsaraprap 38", "Bangkok");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("Itsaraprap 60", "Bangkok");
	}

}
