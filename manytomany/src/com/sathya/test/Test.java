package com.sathya.test;

import com.sathya.dao.IMTMDao;
import com.sathya.dao.MTMDaoFactory;

public class Test {

	public static void main(String[] args) {
		IMTMDao dao=MTMDaoFactory.getInstance();
		//dao.saveBookAndAuthor();
		dao.removeAuthorFromBook(901, 10101);
	}

}
