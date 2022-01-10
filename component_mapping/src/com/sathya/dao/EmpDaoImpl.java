package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Address;
import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class EmpDaoImpl implements IempDao {
	private static SessionFactory factory;
	
	public EmpDaoImpl(){
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveEmployeeWithAddress() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEno(485);
		emp.setEname("naveen");
		Address addr=new Address();
		addr.setHno("1-124");
		addr.setStreet("polumallaStreet");
		addr.setCity("polumallacity");
		emp.setAddr(addr);
		session.save(emp);
		System.out.println(emp);
		tx.commit();
		session.close();
	}

	@Override
	public void readEmployeeWithAddress(int eno) {
		
		Session session=factory.openSession();
		Employee e=(Employee)session.get(Employee.class,eno);
		System.out.println(e);
		session.close();
	}

}
