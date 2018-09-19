package com.gio;

public class Address {

	private String address;

	public Address() {
		this.address = "constructor address";
	}

	public Address(String add) {
		this.address = add;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
