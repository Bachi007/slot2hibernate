package com.slot2hibernate;
//manytomany
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class showroom {
public static void main(String args[])
{
	Configuration conf=new Configuration().configure().addAnnotatedClass(developer.class).addAnnotatedClass(laptop.class);
	
	SessionFactory sf=conf.buildSessionFactory();
	Session ses=sf.openSession();
	
	ses.beginTransaction();
	
//	developer d1=new developer();
//	d1.setDevId(101);
//	d1.setDevName("bhaskar");
//	d1.setDevProject("ECI");
//	
//	developer d2=new developer();
//	d2.setDevId(102);
//	d2.setDevName("Anu");
//	d2.setDevProject("TTD");
//	
//	laptop l1=new laptop();
//	l1.setLapId(1);
//	l1.setLapCompany("Acer Predator");
//	
//	laptop l2=new laptop();
//	l2.setLapId(2);
//	l2.setLapCompany("MSI GF3");
//	
//	List<laptop> ll=new ArrayList<laptop>();
//	
//	ll.add(l2);
//	ll.add(l1);
//	d1.setDevlap(ll);
//	
//	List<laptop> ll2=new ArrayList<laptop>();
//	ll2.add(l2);
//	d2.setDevlap(ll2);
//	
//	
//	ses.save(l2);
//	ses.save(l1);
//	ses.save(d2);
//	ses.save(d1);
	
	Query qu=ses.createQuery("from developer");
	List<developer> dl=qu.getResultList();
	
//	for(developer dev:dl)
//	{ 
//		List<laptop> ll=dev.getDevlap();
//		for(laptop lap:ll) {
//			System.out.println(dev.getDevName()+" has "+lap.getLapCompany());
//		}
//	}
	
	
	ses.getTransaction().commit();
	
	
}
}
