package com.sathya.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class EmpDaoImpl implements IEmpDao {
   
	private SessionFactory factory;
	
	public EmpDaoImpl(){
		
		factory=HibernateUtil.getSessionFactory();
	}
	
	@Override
	public List findEmpsByDeptNumber(int deptNumber) {
		
		Session session=factory.openSession();
		Criteria crit=session.createCriteria(Employee.class);
		Criterion c1=Restrictions.eq("deptNumber", deptNumber);
		crit.add(c1);
		List<Employee> list=crit.list();
		System.out.println(list);
		session.close();
		return list;
	}

	@Override
	public List findAggregationResult() {
		Session session=factory.openSession();
		Criteria crit=session.createCriteria(Employee.class);
		//System.out.println(crit);
		Projection p1=Projections.rowCount();
		//System.out.println(p1);
		Projection p2=Projections.sum("empSal");
		//System.out.println(p2);
		Projection p3=Projections.max("empSal");
		//System.out.println(p3);
		ProjectionList plist=Projections.projectionList();
		//System.out.println(plist);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		crit.setProjection(plist);
		List list1=crit.list();
		//System.out.println(list);
		//for(list.get(0))
		//System.out.println(list1.get(0)+" "+list1.toString());
		session.close();
		return list1;

	}


}