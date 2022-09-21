package com.slot2hibernate;
//manytoone
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf=new Configuration().configure().addAnnotatedClass(employee.class).addAnnotatedClass(address.class);
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session ses=sf.openSession();
		ses.beginTransaction();
		
//		address ad1=new address();
//		ad1.setAdId(121);
//		ad1.setAdCity("vizag");
//		ad1.setAdPincode(50020);
//
//		employee e1=new employee();
//		e1.seteId(1);
//		e1.seteName("bhaskar");
//		e1.seteDomain("Full Stack");
//		e1.setEaddress(ad1);
//		
//		employee e2=new employee();
//		e2.seteId(2);
//		e2.seteName("amitava");
//		e2.seteDomain("Java");
//		e2.setEaddress(ad1);
//		
//		ses.save(e2);
//		ses.save(e1);
//		ses.save(ad1);
		

		Query qu=ses.createQuery("from employee");
		List<employee> el=qu.getResultList();
		
		for(employee e:el)
		System.out.println(e.geteName()+" "+e.geteDomain()+e.getEaddress().getAdCity());
		
		ses.getTransaction().commit();;
		
		
		
		
	}

}
