package com.sathya.Dao;

public class EmpDaoFactory {

	private static IEmpDao dao;
	
	public synchronized static IEmpDao getInstance()
	{
	    if (dao==null)
	    {
	    	dao=new EmpDaoImpl();
	    }
		
		return dao;
	
	}
	
	
}
 