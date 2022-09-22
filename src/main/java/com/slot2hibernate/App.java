package com.slot2hibernate;
//inheritance
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.apache.log4j.Logger;
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
	static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner bs=new Scanner(System.in);
    	Configuration conf=new Configuration().configure().addAnnotatedClass(employee.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	
    	Transaction tc=ses.beginTransaction();
    	
    	log.info("Enter empId");
    	int eid=bs.nextInt();
    	log.info("Enter empName");
    	String name=bs.next();
    	log.info("Enter empDomain");
    	String domain=bs.next();
    	
    	employee e1=new employee();
    	e1.setEDomain(domain);
    	e1.setEId(eid);
    	e1.setEName(name);
    	ses.saveOrUpdate(e1);
        log.info(e1);
    	tc.commit();      
        
    	ses.close();
    	    	
//    	List<batsman> bl=qu.getResultList();
//    	for (batsman b:bl)
//    	System.out.println(b);
//    	
    	
    	
    	
    	
//    	batsman bat1=new batsman();
//    	bat1.setPlayerId(7);
//    	bat1.setFirstName("M S");
//    	bat1.setLastName("Dhoni");
//    	bat1.setBattingHand("Right");
//    	bat1.setHighestScore(183);
//    	
//    	batsman bat2=new batsman();
//    	bat2.setPlayerId(18);
//    	bat2.setFirstName("Virat");
//    	bat2.setLastName("Kohli");
//    	bat2.setBattingHand("Right");
//    	bat2.setHighestScore(183);
//    
//    	batsman bat3=new batsman();
//    	bat3.setPlayerId(77);
//    	bat3.setFirstName("Rohit");
//    	bat3.setLastName("Sharma");
//    	bat3.setBattingHand("Right");
//    	bat3.setHighestScore(264);
//    	
//    	bowler b1=new bowler();
//    	b1.setPlayerId(34);
//    	b1.setFirstName("Zaheer");
//    	b1.setLastName("Khan");
//    	b1.setBowlingHand("Left");
//    	b1.setBestFigures("8/25");
//    	
//    	bowler b2=new bowler();
//    	b2.setPlayerId(64);
//    	b2.setFirstName("Asish");
//    	b2.setLastName("Bumrah");
//    	b2.setBowlingHand("Left");
//    	b2.setBestFigures("7/21");
//    	
//    	bowler b3=new bowler();
//    	b3.setPlayerId(10);
//    	b3.setFirstName("Jasprit");
//    	b3.setLastName("Bumrah");
//    	b3.setBowlingHand("Right");
//    	b3.setBestFigures("6/25");
//    	
//    	teamindia t1=new teamindia();
//    	t1.setFirstName("bachi");
//    	t1.setLastName("Ch");
//    	t1.setPlayerId(25);
//    	
//    	ses.save(t1);
//    	ses.save(b3);
//    	ses.save(b2);
//    	ses.save(b1);
//    	ses.save(bat3);
//    	ses.save(bat2);
//    	ses.save(bat1);
//    	
    	
    	
    }
}
