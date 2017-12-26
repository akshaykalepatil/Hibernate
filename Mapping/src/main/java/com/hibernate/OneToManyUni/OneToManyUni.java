package com.hibernate.OneToManyUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyUni {

	public static void main(String[] args) {

		Students s1 = new Students(10, "Akshay");
		Students s2 = new Students(20, "Guru");
		Students s3 = new Students(30, "Mahesh");
		Students s4 = new Students(40, "Himanshu");

		List<Students> list1 = new ArrayList<Students>();
		list1.add(s1);
		list1.add(s4);
//		list1.add(s3);

		List<Students> list2 = new ArrayList<Students>();
		list2.add(s2);
		list2.add(s3);

		College c1 = new College(101, "COEP", list1);
		College c2 = new College(201, "VIT", list2);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction trans = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		
		trans.commit();
//		session.flush();
		session.close();

	}
}