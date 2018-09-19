package com.gio;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired // injected with annotation and beans.xml
	private Address address;
	
	public Student() {}
	
	public Student (Address address) {
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("Student address is: " + address.getAddress());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}