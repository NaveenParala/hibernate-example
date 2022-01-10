package com.sathya.dao;

public class ONODaoFactory {
	
	private static IONODao dao;
	
	public synchronized static IONODao getInstance()
	{
		if(dao==null){
			
			dao=new ONODaoImpl();
		}
		return dao;
	}
	

}
