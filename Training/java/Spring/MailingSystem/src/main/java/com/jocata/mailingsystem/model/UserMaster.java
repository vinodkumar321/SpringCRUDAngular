package com.jocata.mailingsystem.model;

import java.io.Serializable;

public class UserMaster implements Serializable{ //this ORM represents our table

	private static final long serialVersionUID = 6253664968708202579L;
	
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String emailid;
	private String mobilenumber;
	
	public UserMaster() {super();}
	
	
	public UserMaster(String username, String password, String name, String emailid, String mobilenumber) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
	
}
