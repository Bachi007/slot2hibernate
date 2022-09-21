package com.slot2hibernate;
//manytomany
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class developer {

	@Id
	private int devId;
	private String devName;
	private String devProject;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="dev_lap",
			joinColumns= {@JoinColumn(name="devId")},
			inverseJoinColumns= {@JoinColumn(name="lapId")}
			)
	private List<laptop> devlap;
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevProject() {
		return devProject;
	}
	public void setDevProject(String devProject) {
		this.devProject = devProject;
	}
	public List<laptop> getDevlap() {
		return devlap;
	}
	public void setDevlap(List<laptop> devlap) {
		this.devlap = devlap;
	}
	@Override
	public String toString() {
		return "developer [devId=" + devId + ", devName=" + devName + ", devProject=" + devProject + ", devlap="
				+ devlap + "]";
	}
	
}
