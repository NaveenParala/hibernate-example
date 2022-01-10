package com.sathya.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class ONMDaoImpl implements IONMDao {
	
	private SessionFactory factory;
	

	public ONMDaoImpl() {
		
		factory =HibernateUtil.getSessionFactory();
	}


	@Override
	public void saveCustomer() {
		 
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Customer cust=new Customer();
		//one to many
		cust.setCustId(9481);
		cust.setCustName("naveen");
		
		Set<Loan> loans=new HashSet<>();
		
		Loan loan1=new Loan();
		loan1.setLoanId("LN-481");
		loan1.setAmount(82000);
		
		Loan loan2=new Loan();
		loan2.setLoanId("LN-482");
		loan2.setAmount(92000);
	
		Loan loan3=new Loan();
		loan3.setLoanId("LN-483");
		loan3.setAmount(96000);
		//many to one
		loan1.setCustomer(cust);
		loan2.setCustomer(cust);
		loan3.setCustomer(cust);
		//add to collection
		loans.add(loan1);
		loans.add(loan2);
		loans.add(loan3);
		cust.setLoans(loans);
		//save in db
		session.save(loan1);
		tx.commit();
		session.close();
		System.out.println(loans);
	}

}
