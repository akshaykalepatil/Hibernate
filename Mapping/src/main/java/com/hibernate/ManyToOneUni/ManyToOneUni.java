package com.hibernate.ManyToOneUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneUni {

	public static void main(String[] args) {

		Company company1 = new Company(10, "TCS");

		Employee emp1 = new Employee(101, "Akshay", company1);
		Employee emp2 = new Employee(102, "Himu", company1);
		Employee emp3 = new Employee(103, "Amar", company1);
		Employee emp4 = new Employee(104, "Mahesh", company1);
		Employee emp5 = new Employee(105, "Guru", company1);

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		transaction.commit();
		session.close();

	}

}
