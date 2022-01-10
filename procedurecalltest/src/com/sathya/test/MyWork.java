package com.sathya.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import org.hibernate.jdbc.Work;

public class MyWork implements Work {
	
	public void executes(Connection con)throws SQLException
	{
		
		CallableStatement cstmt=con.prepareCall("{?=call emp_bonus(?)}");
		cstmt.registerOutParameter(1, Types.DOUBLE);	
		Scanner s=new Scanner(System.in);
		System.out.println("enter emp number");
		int no=s.nextInt();
		cstmt.setInt(2, no);
		cstmt.execute();
		Double bonus=cstmt.getDouble(1);
		System.err.println("Bonus="+bonus);
		cstmt.close();
	}

	@Override
	public void execute(Connection arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
