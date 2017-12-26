package com.hibernate.OnetoOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {

		Address ad1 = new Address(101, "Pune", 412408);
		Student s1 = new Student(10, "Akshay", ad1);

		Address ad2 = new Address(102, "Kolhapur", 412207);
		Student s2 = new Student(20, "Guru", ad2);

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tranc = session.beginTransaction();
		
		
		s1.setId(ad1.getAddId());
		s2.setId(ad2.getAddId());
		
		session.save(s1);
		session.save(s2);

		tranc.commit();
		session.close();
	}

}
