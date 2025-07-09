package com.afrin.DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Address address() {
		Address address = new Address();
		address.setCity("Chennai");
		return address;
	}

	@Bean
	public Student student() {
		Student student = new Student();
		student.setAddress(address());
		return student;
	}
}
