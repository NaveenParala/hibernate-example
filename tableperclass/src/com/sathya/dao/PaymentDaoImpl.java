package com.sathya.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;
import com.sathya.util.HibernateUtil;

public class PaymentDaoImpl implements IpaymentDao {
	private  static SessionFactory factory;
	public PaymentDaoImpl(){
		factory=HibernateUtil.getSessionFactory();
	}
	
	java.util.Date date=new Date();
	
	@Override
	public void saveCard() {
	
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		Card card=new Card();
		card.setTxId(220000421);
		card.setAmount(10000);
		card.setTxDate(date);
		card.setCardNo(621126724);
		card.setCardType("rupey");
		
		ses.save(card);
		tx.commit();
		ses.close();
		
	}

	@Override
	public void saveCheque() {
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		Cheque cheque=new Cheque();
		cheque.setTxId(45879623);
		cheque.setAmount(5200);
		cheque.setTxDate(date);
		cheque.setChequeno(562345889);
		cheque.setChequeType("ORDER");
	
		ses.save(cheque);
		tx.commit();
		ses.close();
	}

}
