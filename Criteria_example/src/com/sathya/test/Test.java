package com.sathya.test;

import java.util.Iterator;
import java.util.List;

import com.sathya.dao.EmpDaoFactory;
import com.sathya.dao.IEmpDao;
import com.sathya.entity.Employee;

public class Test {

	public static void main(String[] args)
	{
		 IEmpDao dao=EmpDaoFactory.getInstance();
		 //System.out.println(dao);
		List<Employee> list= dao.findEmpsByDeptNumber(30);
		Iterator it=list.iterator();
		//System.out.println(it);
		/*for(Employee e:list){
			System.out.println(e);
		}
		*/	
		
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println(e);
		}
		
		 List<Object[]> list1=dao.findAggregationResult();
		 
		  Object[] obj=list1.get(0);
		  
		 System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
	}

}

