package com.slot2hibernate;
//manytoone
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class employee {

	@Id
	private int eId;
	private String eName;
	private String eDomain;
	@ManyToOne
	private address eaddress;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDomain() {
		return eDomain;
	}
	public void seteDomain(String eDomain) {
		this.eDomain = eDomain;
	}
	public address getEaddress() {
		return eaddress;
	}
	public void setEaddress(address eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "employee [eId=" + eId + ", eName=" + eName + ", eDomain=" + eDomain + ", eaddress=" + eaddress + "]";
	}
	
}
