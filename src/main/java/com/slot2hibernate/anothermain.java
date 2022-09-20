package com.slot2hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class anothermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration conf=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(bike.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	
    	Transaction tc=ses.beginTransaction();
 
//    	student s1=new student();
//    	s1.setStId(1);
//    	s1.setStName("Bhaskar");
//    	s1.setStGroup("MCA");
//    	
//    	bike b1=new bike();
//    	b1.setBikeId(101);
//    	b1.setBikeName("BMW 1250 GS");
//    	
//    	bike b2=new bike();
//    	b2.setBikeId(102);
//    	b2.setBikeName("Triumph Tiger 220");
//    	
//    	List<bike> bl=new ArrayList<bike>();
//    	bl.add(b2);
//    	bl.add(b1);
//    	
//    	s1.setStBike(bl);
//    	ses.save(s1);
//    	ses.save(b1);
//    	ses.save(b2);
    	
    	Query qu=ses.createQuery("from student");
    	List<student> s=qu.getResultList();
    	
    	for(student st:s)
    	{
    		System.out.print(st.getStName()+" has ");
    		
    		List<bike> bb=st.getStBike();
    		for(bike b:bb) {
    			System.out.print(b.getBikeName());
    		}
    		
    	}
    	
    	
    	
    	tc.commit();
	}

}
