package com.gio.inheritance.tableperclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

// Creates a table for each class (object)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // not typically used
@Table(name = "VEHICLE_TABLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	// car and bus can have a name thats why its protected
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