package com.sathya.dao;

public class ONMDaoFactory {
	private static IONMDao dao;
	public static synchronized IONMDao getInstance(){
		
		if(dao==null){
			
			dao=new ONMDaoImpl();
		}
		return dao;
	}

}
