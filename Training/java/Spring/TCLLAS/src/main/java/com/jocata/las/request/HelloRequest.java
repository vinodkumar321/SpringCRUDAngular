package com.jocata.las.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HelloRequest implements Serializable{

	private static final long serialVersionUID = -5406735126885019529L;
	
	private String callerName;

	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}
	
	

}
