package com.slot2hibernate;
//manytomany
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class laptop {

	@Id
	private int lapId;
	private String lapCompany;
	@ManyToMany
	private List<developer> lapdev;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapCompany() {
		return lapCompany;
	}
	public void setLapCompany(String lapCompany) {
		this.lapCompany = lapCompany;
	}
	public List<developer> getLapdev() {
		return lapdev;
	}
	public void setLapdev(List<developer> lapdev) {
		this.lapdev = lapdev;
	}
	@Override
	public String toString() {
		return "laptop [lapId=" + lapId + ", lapCompany=" + lapCompany + ", lapdev=" + lapdev + "]";
	}
	
}
