package com.slot2hibernate;
import javax.persistence.Cacheable;
//manytoone
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class employee {

	@Id
	private int eId;
	private String eName;
	private String eDomain;

	//21
}
