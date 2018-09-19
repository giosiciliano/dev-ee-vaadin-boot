package com.gio.composition.one2one;

import javax.persistence.Column;
// use javax (specification) instead of hibernate (implementation) imports
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {

	@Id
	@GeneratedValue
	private int addressId;

	@Column(name = "address_name")
	private String addressName;

	@Column(name = "zip_code")
	private int zipcode;

	// employeeId stored on ADDRESS_TABLE
	@OneToOne
	@JoinColumn(name="employeeId")
	private Employee employee;
	
	public Address() {}

	public Address(String addressName, int zipcode) {
		this.addressName = addressName;
		this.zipcode = zipcode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
