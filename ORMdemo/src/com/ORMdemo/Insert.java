package com.ORMdemo;

//import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.ORMdemo.Student;

public class Insert {
	
	public static void main(String[] args) {
	
		Student st = new Student();
		st.setId(13);
		st.setName("Ramya");
		st.setAge(21);
		st.setEmail("ramyaperavali136@gmail.com");
		Configuration c1 = new Configuration();
		c1.configure();
		
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		s1.beginTransaction();
		s1.save(st);
		//Serializable recordId = s1.save(st);
		//System.out.println(recordId+" has been saved");
		s1.getTransaction().commit();
		//s1.flush();
		s1.close();
		System.out.println("done");
		System.out.println("done");

	}
}
