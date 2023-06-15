package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
		return new Person(name(), age(), address()); // name(), age(), address()
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {//name,age,address2
		return new Person(name(), age(), address2); 
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {//name,age,address
		return new Person(name(), age(), address); 
	}
	
	@Bean
	public Person person5Qualifier(String name, int age,@Qualifier("address3Qualifier") Address address3) {//name,age,address2
		return new Person(name(), age(), address3); 
	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Itsaraprap 38", "Bangkok");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("Itsaraprap 60", "Chonburi");
	}

}
