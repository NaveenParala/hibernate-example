package com.sathya.test;

import com.sathya.dao.EmpDaoFactory;
import com.sathya.dao.IempDao;

public class Test {
    
	public static void main(String[] args) {
		
		IempDao dao=EmpDaoFactory.getInstance();
		
		dao.saveEmployeeWithAddress();
		
		System.out.println("=============================");
		
		dao.readEmployeeWithAddress(485);
	}

}

