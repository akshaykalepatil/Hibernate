package com.hibernate.ManyToManyBi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyBi {

	public static void main(String[] args) {

		Crops crop1 = new Crops(10, "Sugercane", null);
		Crops crop2 = new Crops(11, "Banana", null);
		Crops crop3 = new Crops(12, "Wheat", null);

		Farms farms1 = new Farms(101, "Akshay", null);
		Farms farms2 = new Farms(201, "Guru", null);
		Farms farms3 = new Farms(301, "Mahesh", null);

		List<Crops> list1 = new ArrayList<Crops>();
		list1.add(crop1);
		list1.add(crop2);

		List<Crops> list2 = new ArrayList<Crops>();
		list2.add(crop3);

		farms1.setCrop(list1);
		farms2.setCrop(list2);
		farms3.setCrop(list1);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(farms1);
		session.save(farms2);
		session.save(farms3);

		transaction.commit();

		session.close();
		
	}
}
