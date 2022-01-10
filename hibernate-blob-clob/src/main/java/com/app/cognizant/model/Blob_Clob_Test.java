package com.app.cognizant.model;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Blob_Clob_Test {

	public static void main(String[] args) throws Exception  {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Student s=new Student();
		s.setSid(420);
		s.setSname("Raman");
		s.setSfee("22000");
		FileInputStream fis=new FileInputStream("C:/Users/navee/Downloads/np.jpg");
		byte[] arr=new byte[fis.available()];
		fis.read(arr);
		s.setSimage(arr);
		String str="welcome suryapet";
		char[] ch=str.toCharArray();
		s.setStext(ch);
		//session.save(s);
//		Transaction tx=session.beginTransaction();
//		tx.commit();
		Student std=session.get(Student.class, 420);
		System.out.println(std);
		session.close();
	}

}



