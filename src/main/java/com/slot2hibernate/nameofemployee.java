package com.slot2hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class nameofemployee {

	
	private String empFirstName;
	private String empLastName;
	private String empMiddleName;
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpMiddleName() {
		return empMiddleName;
	}
	public void setEmpMiddleName(String empMiddleName) {
		this.empMiddleName = empMiddleName;
	}
	@Override
	public String toString() {
		return "nameofemployee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", empMiddleName="
				+ empMiddleName + "]";
	}
	
	
}
