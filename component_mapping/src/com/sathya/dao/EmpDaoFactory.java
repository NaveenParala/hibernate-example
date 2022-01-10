package com.sathya.dao;

public class EmpDaoFactory {
	private static IempDao dao;
	public synchronized static IempDao getInstance(){
		
		if(dao==null){
			
			dao=new EmpDaoImpl();
		}
		return dao;
	}

}
