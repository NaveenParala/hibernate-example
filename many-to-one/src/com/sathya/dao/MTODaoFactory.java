package com.sathya.dao;

public class MTODaoFactory {
	private static IMTODao dao;
	public static IMTODao getInstancce()
	{
		if(dao==null){
			dao=new MTODaoImpl();
			
		}
		
		return dao;
		
	}

}
