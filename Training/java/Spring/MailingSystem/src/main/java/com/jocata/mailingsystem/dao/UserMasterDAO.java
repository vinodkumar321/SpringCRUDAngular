package com.jocata.mailingsystem.dao;

import com.jocata.mailingsystem.model.UserMaster;

public class UserMasterDAO extends MailSystemDAO{

	@Override
	public boolean save(Object obj) {//we are receiving UserMaster but in the form of Object
		//type cast the obj into UserMaster and read the data received
		UserMaster userMaster = (UserMaster) obj;
		
		this.sql = "insert into usermaster (username, password, name, emailid, mobilenumber)"
				+ "values('"+ userMaster.getUsername() +"','"+ userMaster.getPassword() +"',"
						+ "'"+ userMaster.getName() +"','"+ userMaster.getEmailid()+"',"
								+ "'"+userMaster.getMobilenumber()+"')";
		return super.save(obj);
	}
	

}
