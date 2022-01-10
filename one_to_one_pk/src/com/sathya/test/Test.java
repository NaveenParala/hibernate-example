package com.sathya.test;

import com.sathya.dao.IONODao;
import com.sathya.dao.ONODaoFactory;

public class Test {

	public static void main(String[] args) {
		
		IONODao dao=ONODaoFactory.getInstance();
		
		dao.savePassportWithPerson();
	}

}
