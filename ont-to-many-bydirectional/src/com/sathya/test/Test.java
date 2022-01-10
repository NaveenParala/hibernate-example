package com.sathya.test;

import com.sathya.dao.IONMDao;
import com.sathya.dao.ONMDaoFactory;

public class Test {

	public static void main(String[] args) {
		
		IONMDao dao=ONMDaoFactory.getInstance();
		dao.saveCustomer();

	}

}
