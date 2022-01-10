package com.sathya.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Student;
import com.sathya.entity.Student_Id;
import com.sathya.util.HibernateUtil;

public class StudentDaoImpl implements IstudentDao {
	private SessionFactory factory;
	public StudentDaoImpl() {
		 factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveStedent() {
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		Student_Id sid=new Student_Id();
		System.out.println(sid);
		sid.setName("navee");
		sid.setAdate(new java.util.Date());
		sid.setPeriod(2);
		Student s=new Student();
		s.setSid(sid);
		s.setPresent("yes");
		ses.save(s);
		System.out.println(s);
		tx.commit();
		ses.close();
		
	}

	@Override
	public void readStudent() {
		
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		Student_Id sid=new Student_Id();
		sid.setName("naveen");
		sid.setAdate(new java.util.Date());
		sid.setPeriod(1);
		System.out.println(sid);
		Student s=(Student)ses.get(Student.class, sid);
		System.out.println(s);
		tx.commit();
		ses.close();
	}

}
