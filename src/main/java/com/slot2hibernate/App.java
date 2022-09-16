package com.slot2hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration conf=new Configuration().configure().addAnnotatedClass(employee.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	
    	Transaction tc=ses.beginTransaction();
    	//add employee
//    	employee e1=new employee();
//    	e1.setEmpId(101);
//    	e1.setEmpName("bachi");
//    	e1.setEmpDomain("Full Stack");
//    	e1.setEmpCity("vizag");
//    	e1.setEmpSalary(52000);
//    	ses.save(e1);
    	//retrive one column
//    	employee e1=null;
//    	
//    	e1=(employee)ses.get(employee.class,101);
//    	
//    	System.out.println(e1);
    	//printing all the employees
    	Query qu=ses.createQuery("from employee");
    	List<employee> ll=qu.getResultList();
    	
    	System.out.println("Id\tName\tCity\tsalary");
    	
    	for(employee e:ll)
    	System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpCity()+"\t"+e.getEmpSalary());
    	
    	
    	tc.commit();
    }
}
