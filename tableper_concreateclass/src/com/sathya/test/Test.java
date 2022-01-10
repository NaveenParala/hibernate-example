package com.sathya.test;

import java.util.Date;

import com.sathya.dao.IpaymentDao;
import com.sathya.dao.PaymentDaoFactory;
import com.sathya.dao.PaymentDaoImpl;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public class Test {

	public static void main(String[] args) {

		IpaymentDao dao=PaymentDaoFactory.getInstance();
		Card card=new Card();
		card.setTxId(4512412);
		card.setAmount(82100);
		card.setTxDate(new Date());
		card.setCardno(45720010);
		card.setCardtype("visa");
		System.out.println("card");
		dao.saveCard(card);
		System.out.println("===================");
		Cheque che=new Cheque();
		che.setTxId(1425142);
		che.setAmount(10200);
		che.setTxDate(new Date());
		che.setChequeno(6211267);
		che.setCheuqetype("Order");
		System.out.println("cheque");
		dao.saveCheque(che);
	}

}
