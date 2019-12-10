package com.org.mappings.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToManyMain {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		

		Set<Course> courses=new HashSet<Course>();
		courses.add(new Course(1,"Maths"));
		courses.add(new Course(2,"Science"));
		
		Student student1=new Student(4,"Subhan",courses);
		Student student2=new Student(5,"Sailaja",courses);
		
		session.save(student1);
		session.save(student2);
		trans.commit();
		
	}

}
