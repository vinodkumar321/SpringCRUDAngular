package com.jocata.mailingsystem.service;

import com.jocata.mailingsystem.dao.UserMasterDAO;
import com.jocata.mailingsystem.model.UserMaster;
import com.jocata.mailingsystem.request.UserRegistrationRequest;

public class UserMasterService {
	public boolean registerNewUser(UserRegistrationRequest regRequest) {
		UserMaster userMaster = new UserMaster();
		userMaster.setUsername(regRequest.getUsername());
		userMaster.setPassword(regRequest.getPassword());
		userMaster.setName(regRequest.getName());
		userMaster.setEmailid(regRequest.getEmailid());
		userMaster.setMobilenumber(regRequest.getMobileNumber());
		
		UserMasterDAO userMasterDAO = new UserMasterDAO();
		return userMasterDAO.save(userMaster);
	} 

}
