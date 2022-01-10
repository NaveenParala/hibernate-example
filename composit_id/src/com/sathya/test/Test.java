
package com.sathya.test;

import com.sathya.dao.IstudentDao;
import com.sathya.dao.StudentDaoFactory;

public class Test {

	public static void main(String[] args) {
		IstudentDao dao=StudentDaoFactory.getInstance();
		dao.saveStedent();
		System.out.println("==============================");
		dao.readStudent();
		
	}

}
