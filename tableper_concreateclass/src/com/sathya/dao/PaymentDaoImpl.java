package com.sathya.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;
import com.sathya.util.HibernateUtil;

public class PaymentDaoImpl implements IpaymentDao {
	private  SessionFactory factory;
	public PaymentDaoImpl(){
		
		factory=HibernateUtil.getSessionFactory();
	}
	
	@Override
	public void saveCard(Card card) {
	
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(card);
		tx.commit();
		ses.close();
	}

	@Override
	public void saveCheque(Cheque cheque) {
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(cheque);
		tx.commit();
		ses.close();

	}

	
}
