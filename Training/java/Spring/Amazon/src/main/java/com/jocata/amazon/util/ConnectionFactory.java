package com.jocata.amazon.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
	  static {
		  try {
			      Class.forName("com.mysql.cj.jdbc.Driver"); // for mysql version >= 8.0
			      // Class.forName("com.mysql.jdbc.Driver") for mysql versions < 8.0
			      
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	  
   public static Connection getConnection() {
	  Connection con = null;
	  try {
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root1","root1");
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  return con;
   }
}