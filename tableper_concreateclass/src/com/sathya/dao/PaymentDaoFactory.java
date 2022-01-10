package com.sathya.dao;

public class PaymentDaoFactory {
	private static IpaymentDao dao;
	public static synchronized IpaymentDao getInstance()
	{
		if(dao==null){
			dao=new PaymentDaoImpl();
		}
		return dao;
	}

}
