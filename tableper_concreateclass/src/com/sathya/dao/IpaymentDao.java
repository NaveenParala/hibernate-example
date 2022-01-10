package com.sathya.dao;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public interface IpaymentDao {
	public void saveCard(Card card);
	public void saveCheque(Cheque cheque);

}
