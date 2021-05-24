package com.ORMdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration c1=new Configuration();
	    c1.configure();
	   
	    SessionFactory sf=c1.buildSessionFactory();
	    Session s1=sf.openSession();
	   	   
	    Student obj=(Student) s1.get(Student.class, 11);
	   
	    if(obj!=null){
	        s1.beginTransaction();
	        s1.delete(obj);
	       
	        s1.getTransaction().commit();
	        System.out.println("done");
	    }
	   
	    else{
	        System.out.println("no record found");
	    }
	}

}
