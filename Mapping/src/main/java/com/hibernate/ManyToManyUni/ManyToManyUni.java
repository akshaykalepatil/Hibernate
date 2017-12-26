package com.hibernate.ManyToManyUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyUni {

	public static void main(String[] args) {

		Authors author1 = new Authors(10, "Akshay");
		Authors author2 = new Authors(20, "Mahesh");

		List<Authors> list1 = new ArrayList<Authors>();
		list1.add(author1);
		list1.add(author2);

		Books book = new Books(101, "ShrimanYogi", list1);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(book);
		
		transaction.commit();
		
		session.close();
	}

}
