package com.slot2hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	private int empId;
	private String empName;
	private String empDomain;
	private int empSalary;
	private String empCity;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDomain() {
		return empDomain;
	}
	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empDomain=" + empDomain + ", empSalary="
				+ empSalary + ", empCity=" + empCity + "]";
	}
	
	
	
}
