package com.sathya.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class OTMDaoImpl implements IOTMDao {
	private SessionFactory factory;
	public OTMDaoImpl(){
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void saveCustomerWithOneToManyFields() {
		//open session 
		Session sesssion=factory.openSession();
		//create customer object
		Customer cust=new Customer();
		cust.setCustId(10112);
		cust.setCustName("naveen");
		//create collection object
		List<Loan> al=new ArrayList<>();
		//create a loan objects
		Loan loan1=new Loan();
		loan1.setLoanId("LN-091");
		loan1.setAmount(90000);
		Loan loan2=new Loan();
		loan2.setLoanId("LN-092");
		loan2.setAmount(80000);
		Loan loan3=new Loan();
		loan3.setLoanId("LN-093");
		loan3.setAmount(70000);
		//add loan object to the collection object
		al.add(loan1);
		al.add(loan2);
	    al.add(loan3);
		//set collection object to the customer object
		cust.setLoans(al);
		//begin transaction 
		Transaction tx=sesssion.beginTransaction();
		//save customer object into the db
		sesssion.save(cust);
		tx.commit();
		sesssion.close();
	}

	/*@Override
	public void addAnotherLoaToCustomer(Loan loan4) {
		Session session=factory.openSession();
     //select customer object from database
		
		Customer cust=(Customer)session.get(Customer.class, 10112);
		//retrieve the collection object
		Set<Loan> loan=cust.getLoans();
		Transaction tx=session.beginTransaction();
		loan.add(loan4);
		tx.commit();
		session.close();
	}

	@Override
	public void removeOneLoanObjct() {
		Session session=factory.openSession();
		//select customer object from db
		Customer cust=(Customer)session.get(Customer.class, 10112);
		//retrieve the collection object
		Set<Loan> loan=cust.getLoans();
		Loan l1=(Loan)session.get(Loan.class, "LN-094");
		Transaction tx=session.beginTransaction();
		loan.remove(l1);
		tx.commit();
		session.close();
	}

	@Override
	public void removeCustomerTable(int custId) {
		Session session=factory.openSession();
		Customer cust=(Customer)session.get(Customer.class, custId);
		Transaction tx=session.beginTransaction();
		session.delete(cust);
		tx.commit();
		session.close();
		
	}
	*/
	
	

}
