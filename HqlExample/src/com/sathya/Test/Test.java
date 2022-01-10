package com.sathya.Test;

import java.util.Iterator;
import java.util.List;

import com.sathya.Dao.EmpDaoFactory;
import com.sathya.Dao.IEmpDao;
import com.sathya.entity.Employee;

public class Test {

	public static void main(String[] args) {
		IEmpDao dao=EmpDaoFactory.getInstance();
		List list=dao.findEmpsByDeptNumber(20);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			System.out.println(e);
		}
	int i=dao.updateEmpsByDeptNumber(30);
	System.out.println("no of employees updated:"+i);
	
	}
	

}
