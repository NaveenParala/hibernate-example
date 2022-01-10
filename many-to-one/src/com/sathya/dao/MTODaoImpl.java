package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class MTODaoImpl implements IMTODao {

	private SessionFactory factory;
	public MTODaoImpl(){
		factory=HibernateUtil.getSessionFactory();
	}
	
	/*@Override
	public void saveLoanWithCustomer() {
		Session sessin=factory.openSession();
		Customer cust=new Customer();
		cust.setCustId(12455);
		cust.setCustName("naveen");
		
		Transaction tx=sessin.beginTransaction();
		Loan loan1=new Loan();
		loan1.setLoanId("LN-481");
		loan1.setAmount(85000);
		loan1.setCustomer(cust);
		sessin.save(loan1);
		
		Loan loan2=new Loan();
		loan2.setLoanId("LN-482");
		loan2.setAmount(60000);
		loan2.setCustomer(cust);
		sessin.save(loan2);
		
		Loan loan3=new Loan();
		loan3.setLoanId("LN-483");
		loan3.setAmount(90000);
		loan3.setCustomer(cust);
		sessin.save(loan3);
		
		tx.commit();
		sessin.close();
	}

*/	@Override
	public void removeLoan(String loanId) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Loan loan=(Loan)session.get(Loan.class, loanId);
		session.delete(loan);
		tx.commit();
		session.close();
	}


}