package com.gio.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // tells spring that this is a bean
public class Student {
	
	@Autowired  // injected bean
	private Address address;
	
	public String showInfo() {
		return this.address.getAddress();
	}

}
