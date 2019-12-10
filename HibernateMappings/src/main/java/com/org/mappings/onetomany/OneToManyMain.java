package com.org.mappings.onetomany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToManyMain {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		Answer answer1=new Answer();
		answer1.setaId(1);
		answer1.setAnsType("Servlet is an API");
		answer1.setPostedBy("Subhan");
		
		Answer answer2 =new Answer();
		answer2.setaId(2);
		answer2.setAnsType("Servlet is an interface");
		answer2.setPostedBy("Baba");
		
		Answer answer3 = new Answer();
		answer3.setaId(3);
		answer3.setAnsType("Servlet is Technology");
		answer3.setPostedBy("Vali");
		
		Answer answer4 = new Answer();
		answer4.setaId(4);
		answer4.setAnsType("Java is a secured language");
		answer4.setPostedBy("Sriram");
		
		Answer answer5 = new Answer();
		answer5.setaId(5);
		answer5.setAnsType("Java is a object oriented language");
		answer5.setPostedBy("Reddy");
		
		
	    List<Answer> list1=new ArrayList<Answer>();
		list1.add(answer1);
		list1.add(answer2);
		list1.add(answer3);
		
		List<Answer> list2=new ArrayList<Answer>();
		list2.add(answer4);
		list2.add(answer5);
		
		Question qstn1=new Question();
		qstn1.setqId(33);
		qstn1.setQname("What is Servlet");
		qstn1.setAnswers(list1);
		
		
		Question qstn2=new Question();
		qstn2.setqId(35);
		qstn2.setQname("What is Java");
		qstn2.setAnswers(list2);
		
		
		session.save(qstn1);
		session.save(qstn2);
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		session.save(answer4);
		session.save(answer5);
		session.save(list1);
		session.save(list2);
		
		trans.commit();
		session.close();
		
		System.out.println("Success");
		
	}

}
