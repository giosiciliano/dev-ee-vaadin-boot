package com.gio.inheritance.joined;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


// Creates 3 tables, Vehicle_table (type {Bus or Car}, id, and
// name {of bus or car}; Bus (id, numberOfPassengers); and
// Car (id, speed) all linked together by id 
// @PrimaryKeyJoinColumn(referencedColumnName="id")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="VEHICLE_TABLE")
@DiscriminatorColumn(name = "type")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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