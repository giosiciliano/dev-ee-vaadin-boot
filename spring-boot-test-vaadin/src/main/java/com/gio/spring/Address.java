package com.gio.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String address = "123 Main St";
			
	public String getAddress() {
		return this.address;
		
	}

}
