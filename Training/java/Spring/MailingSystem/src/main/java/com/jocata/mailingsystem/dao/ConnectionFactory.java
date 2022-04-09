package com.jocata.mailingsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
		}catch(Exception e) {System.out.println(e);}
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mailingsystem","root1","root1");
		}catch(Exception e) {System.out.println(e);}
		return con;
	}
}
