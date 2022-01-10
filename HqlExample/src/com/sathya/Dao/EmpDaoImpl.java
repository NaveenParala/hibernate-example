package com.sathya.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.Util.HibernateUtil;

public class EmpDaoImpl implements IEmpDao {
	private SessionFactory factory;
	

	public EmpDaoImpl() {
	
		factory = HibernateUtil.getSessionFactory();
	}

	public List findEmpsByDeptNumber(int deptNumber) {
	Session session=factory.openSession();
	Query query=session.createQuery("from Employee e where e.deptNumber=?");
	query.setParameter(0, deptNumber);
	List list=query.list();
		session.close();
		return list;
	}

	public int updateEmpsByDeptNumber(int deptNumber) {
		Session session =factory.openSession();
		Query query=session.createQuery("update Employee e set e.empsal=10000 where e.deptNumber=?");
		Transaction tx=session.beginTransaction();
		query.setParameter(0, deptNumber);
		int i=query.executeUpdate();
		tx.commit();
		session.close();
		
		return i;
	}

}
