package com.app.hibernate.model;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CollectionTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Person p=new Person();
		//		p.setPid(522);
		//		p.setPname("rajakumari");
		////		p.getPhoneno().add("9665685610");
		////		p.getPhoneno().add("9750142300");
		////		p.getPhoneno().add("7702386164");
		//		p.getPersonData().add("d1");
		//		p.getPersonData().add("d2");
		//		p.getPersonData().add("d3");
		//		p.getData().put(1, "p1");
		//		p.getData().put(2, "p2");
		//		p.getData().put(3, "p3");
		//		session.save(p);
		//		tx.commit();
		Person person=session.get(Person.class, 522);
		System.out.println(person);
		session.close();
	}

}
