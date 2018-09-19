package com.gio.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity // refers to the java class
@Table(name = "STUDENT") // refers to table in db
public class Student {

	@Id // primary key of the table
	@Column(name = "id") // refers to the column on table
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="grade")
	private int grade;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Transient // doesnt exist on table
	private String address;

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.address = address;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
