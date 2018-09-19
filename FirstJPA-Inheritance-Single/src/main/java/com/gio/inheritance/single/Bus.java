package com.gio.inheritance.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
public class Bus extends Vehicle {

	private int numberOfPassengers;

	public Bus() {
	}

	public Bus(String name, int numberOfPassengers) {
		super(name);
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

}
