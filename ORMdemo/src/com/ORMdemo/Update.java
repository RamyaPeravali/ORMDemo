package com.ORMdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration c1=new Configuration();
	    c1.configure();
	    SessionFactory sf=c1.buildSessionFactory();
	    Session s1=sf.openSession();
	    
	    Student obj=(Student) s1.get(Student.class, 10);
	    if (obj!=null){
	    	obj.setName("Bella");
	    	obj.setAge(24);
	    	
	    	s1.beginTransaction();
		    s1.update(obj);
		    s1.getTransaction().commit();
		    System.out.println("updated successfully");
	    }
	    else{
	    	System.out.println("record not found");
	    }
	}

}
