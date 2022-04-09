package com.jocata.mailingsystem.request;

import java.io.Serializable;

public class UserRegistrationRequest implements Serializable{// this pojo represents reg.html
	
	private static final long serialVersionUID = 2141643024353902680L;
	
	private String username;
	private String password;
	private String name;
	private String emailid;
	private String mobileNumber;
	
	public UserRegistrationRequest() {super();}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
