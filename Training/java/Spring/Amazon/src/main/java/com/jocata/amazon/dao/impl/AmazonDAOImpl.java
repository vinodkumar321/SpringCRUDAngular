package com.jocata.amazon.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jocata.amazon.dao.AmazonDAO;
import com.jocata.amazon.util.ConnectionFactory;

public abstract class AmazonDAOImpl implements AmazonDAO {

	protected String sql=null;
	public boolean save(Object entity) {
		return performSaveUpdateDelete();
	}

	public boolean update(Object entity) {
		return performSaveUpdateDelete();
	}

	public boolean delete(Object entity) {
		return performSaveUpdateDelete();
	}

	protected boolean performSaveUpdateDelete() {
		Connection con = null;
		Statement stmt = null;
		try {
			  con = ConnectionFactory.getConnection();
		      stmt = con.createStatement();
		      stmt.executeUpdate(sql); // this will be updated by ChildDAO by specific one
		      // executeUpdate(sql) used for insert, update, delete, create, alter, drop
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		finally {
			if(con != null)
				 con = null;
			if(stmt != null)
				stmt = null;
		}
		return true;
	}
	
	protected ResultSet getResultSet() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			  con = ConnectionFactory.getConnection();
		      stmt = con.createStatement();
		      rs = stmt.executeQuery(sql); // this will be updated by ChildDAO by specific one
		      // executeQuery(sql) used for select
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(con != null)
				 con = null;
		}
		return rs;
		
	}


}
