package com.gio.inheritance.single;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


// Merges all of the inherited values into separate columns on the table
// with a type that will distinguish between the rows, also null values
// for cols that are not related to the type
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="VEHICLE_TABLE")
@DiscriminatorColumn(name = "type")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// car and bus can have a name thats why its protectd
	protected String name;

	public Vehicle() {
	}

	public Vehicle(String name) {
		this.name = name;
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

}
