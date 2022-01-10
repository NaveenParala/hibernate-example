package com.sathya.id;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomerIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor si, Object o) throws HibernateException {
		
		String custId="";
		try {
			Connection con=si.connection();
			Statement st=con.createStatement();
			String sql="select s1.nextval from dual";
			ResultSet rs=st.executeQuery(sql);
			rs.next();
			int i=rs.getInt(1);
			if(i<=9){
				
				custId="c00"+i;
			}
			else if(i>=10 && i<=99){
				
				custId="c0"+i;
			}
			else{
				
				custId="c"+i;
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();		
		}	
		return custId;
	}

}
