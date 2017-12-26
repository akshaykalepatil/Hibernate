package com.hibernate.OnetoOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDirectional {

	public static void main(String[] args) {

		Address1 add = new Address1(1, "Pune", 412148, null);
		Address1 add1 = new Address1(2, "Mumbai", 434245, null);

		Student1 stud = new Student1(10, "Akshay", add);
		Student1 stud1 = new Student1(20, "Mahesh", add1);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		add.setStudent1(stud);
		add1.setStudent1(stud1);

		session.save(stud);
		session.save(stud1);

		tran.commit();
		session.close();

	}

}
