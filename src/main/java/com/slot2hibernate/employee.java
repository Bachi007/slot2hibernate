package com.slot2hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="emptable")
public class employee {

	@Id
	
	@Column(name="rollNo")
	private int empId;
	private nameofemployee empName;
	@Transient
	private String empDomain;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public nameofemployee getEmpName() {
		return empName;
	}
	public void setEmpName(nameofemployee empName) {
		this.empName = empName;
	}
	public String getEmpDomain() {
		return empDomain;
	}
	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empDomain=" + empDomain + "]";
	}
	
	
}
