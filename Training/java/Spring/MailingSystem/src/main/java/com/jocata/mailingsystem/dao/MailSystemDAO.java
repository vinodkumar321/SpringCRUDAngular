package com.jocata.mailingsystem.dao;


import java.sql.Connection;
import java.sql.Statement;

public abstract class MailSystemDAO {

	public String sql=null; //this will be used by his subclasses to supply the query
	
	public MailSystemDAO() {
		super();		
	}

	public boolean save(Object obj) {
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		
		}catch(Exception e) {System.out.println(e); return false;}
		return true;
	}
}
