package com.sathya.test;

import com.sathya.dao.IMTODao;
import com.sathya.dao.MTODaoFactory;

public class Test {
 
	public static void main(String[] args) {
		IMTODao dao=MTODaoFactory.getInstancce();
		//dao.saveLoanWithCustomer();
		dao.removeLoan("LN-481");
	}
}
