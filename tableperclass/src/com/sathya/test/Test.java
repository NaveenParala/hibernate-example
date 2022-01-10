package com.sathya.test;

import com.sathya.dao.IpaymentDao;
import com.sathya.dao.PaymentDaoFactory;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public class Test {

	public static void main(String[] args) {
 
		IpaymentDao dao=PaymentDaoFactory.getInstance();
		dao.saveCard();
		System.out.println("=========================");
	    dao.saveCheque();
		
	}

}
