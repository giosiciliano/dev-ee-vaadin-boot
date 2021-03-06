package com.gio.mapped;

import javax.persistence.MappedSuperclass;

/*
 * Designates a class whose mapping information is applied 
 * to the entities that inherit from it. A mapped superclass 
 * has no separate table defined for it. 
 */
@MappedSuperclass
public class AbstractStudentPerson {

	protected String drivingLicense;

	public AbstractStudentPerson() {
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

}
