package com.gio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
 * replaces beans.xml
 */
@Configuration
public class MyConfig {
	
	@Bean(name="student_bean")
	@Scope(value="singleton")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean(name="1")
	public Address getAddress() {
		return new Address("1");
	}
	
	@Bean(name="2")
	public Address getAddress2() {
		return new Address("2");
	}

}
