package com.sathya.dao;

public class EmpDaoFactory {

	private static IEmpDao dao;
	
	public static synchronized IEmpDao getInstance()
	{
		if(dao==null){
			
			dao=new EmpDaoImpl();
		}
		
		return dao;
	}
}
