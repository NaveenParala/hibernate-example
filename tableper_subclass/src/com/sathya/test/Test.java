package com.sathya.test;

import java.util.Date;

import com.sathya.dao.IpaymentDao;
import com.sathya.dao.PaymentDaoFactory;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public class Test {
 public static void main(String[] args) {
	IpaymentDao dao=PaymentDaoFactory.getInstance();
	Card card=new Card();
	card.setTxId(4576812);
	card.setAmount(8000);
	card.setTxDate(new java.util.Date());
	card.setCardno(4553214);
	card.setCardtype("mastro");
	dao.saveCard(card);
	System.out.println("==============================");
	Cheque cheque=new Cheque();
	cheque.setTxId(5684592);
	cheque.setAmount(5000);
	cheque.setTxDate(new Date());
	cheque.setChequeno(6214582);
	cheque.setChequetype("Order");
	dao.saveCheque(cheque);
}
}
