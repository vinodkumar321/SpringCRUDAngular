package com.jocata.las.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HelloResponse implements Serializable{

	private static final long serialVersionUID = 7533727050370789966L;

	private String helloMessage;

	public String getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	
}
