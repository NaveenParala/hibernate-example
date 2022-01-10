package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.entity.Customer;

public class InsertCustomer {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Customer c=new Customer();
		c.setCustName("raju");
		c.setLocation("polumalla");
		Transaction tx=session.beginTransaction();
		session.save(c);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
