package com.hibernate.ManyToOneBi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneBI {

	public static void main(String[] args) {

		Hospitals hosp1 = new Hospitals(10, "Apolo", null);
		Hospitals hosp2 = new Hospitals(20, "Sasun", null);
		Hospitals hosp3 = new Hospitals(30, "Sahyandri", null);

		Patients patient1 = new Patients(501, "Guru", null);

		hosp1.setPatients(patient1);
		hosp2.setPatients(patient1);
		hosp3.setPatients(patient1);

		List<Hospitals> list1 = new ArrayList<Hospitals>();
		list1.add(hosp1);
		list1.add(hosp2);
		list1.add(hosp3);

		patient1.setHospitals(list1);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(patient1);

		transaction.commit();

		session.close();

	}

}
