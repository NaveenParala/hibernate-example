package com.sathya.test;

import com.sathya.dao.IOTMDao;
import com.sathya.dao.OTMDaoFactory;
import com.sathya.entity.Loan;

public class Test {

	public static void main(String[] args) {
    IOTMDao dao=OTMDaoFactory.getInstance();
   
   /* dao.saveCustomerWithOneToManyFields();
    
    System.out.println("=====================");
    
    Loan loan4=new Loan();
    loan4.setLoanId("LN-094");
    loan4.setAmount(60000);
    
    dao.addAnotherLoaToCustomer(loan4);

    dao.removeOneLoanObjct();
    dao.removeCustomerTable(10112);
    
*/   
    //dao.readAllCustomer();
   // dao.joinTest();
	}

}
