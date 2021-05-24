package com.ORMdemo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertFromConsole {

	public static void main(String[] args) {
		Configuration c1=new Configuration();
        c1.configure();
        
        SessionFactory sf=c1.buildSessionFactory();
        Session s1=sf.openSession();
        
        Scanner sc=new Scanner(System.in);
        Student student=null;
        s1.beginTransaction();
        
        do{
            student=new Student();
            System.out.println("eneter student id");
            student.setId(sc.nextInt());
            
            System.out.println("eneter Student name");
            student.setName(sc.next());
            
            System.out.println("eneter age");
            student.setAge(sc.nextInt());
            
            System.out.println("enter email");
            student.setEmail(sc.next());
            s1.save(student);
            System.out.println("do u want to insert more records(y/n)?");
        }while("y".equalsIgnoreCase(sc.next()));
        
        s1.getTransaction().commit();
        System.out.println("done");

	}

}