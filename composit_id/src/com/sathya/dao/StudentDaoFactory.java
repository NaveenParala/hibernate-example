package com.sathya.dao;

public class StudentDaoFactory {
	private static IstudentDao dao;
	public static IstudentDao getInstance()
	{
		if(dao==null){
			
			dao=new StudentDaoImpl();
		}
		return dao;
	}

}
