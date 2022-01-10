package com.sathya.dao;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Passport;
import com.sathya.entity.Person;
import com.sathya.util.HibernateUtil;

public class ONODaoImpl implements IONODao {
	private SessionFactory factory;

	public ONODaoImpl() {
		
		public ONODaoImpl() {
			super();
		}
		
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void savePassportWithPerson() {
		
		Person person=new Person();
		person.setPersonId(1101101);
		person.setPersonName("naveen");
		
		Passport passport=new Passport();
		//passport.setPassportNo(9481);
		try{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date expDate=sdf.parse("16-02-2029");
			passport.setExpDate(expDate);
		}catch (Exception e) {
			System.out.println(e);
		}
		passport.setPerson(person);
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(passport);
		tx.commit();
		ses.close();
		
	}
	

}
