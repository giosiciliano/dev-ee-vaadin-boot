package com.gio.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {

	
	// Validator's round up!!!
	@NotNull(message="Have to specify name")
	private String name;
	
	@NotNull(message="Age can not be null")
	@Min(value=0, message="Age can not be smaller than 0")
	@Max(value=100, message="No way you are 100 or over!")
	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
