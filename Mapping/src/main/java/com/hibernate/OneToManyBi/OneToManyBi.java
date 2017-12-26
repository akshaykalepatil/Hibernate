package com.hibernate.OneToManyBi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyBi {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TalentStudents stud1 = new TalentStudents(101, "Akshay", null);
		TalentStudents stud2 = new TalentStudents(201, "Guru", null);
		TalentStudents stud3 = new TalentStudents(301, "Mahesh", null);

		Departments dep1 = new Departments(10, "Computer", null);
		Departments dep2 = new Departments(20, "E&tc", null);

		stud1.setDepartment(dep1);
		stud2.setDepartment(dep2);
		stud3.setDepartment(dep1);

		List<TalentStudents> list1 = new ArrayList<TalentStudents>();
	//	list1.add(stud1);
		list1.add(stud2);
		list1.add(stud3);

		List<TalentStudents> list2 = new ArrayList<TalentStudents>();
//		list2.add(stud2);
		list2.add(stud1);

		dep1.setStudents(list1);
		dep2.setStudents(list2);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(dep1);
		session.save(dep2);

		trans.commit();
		session.close();

	}

}
