package com.jocata.las.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LASCreateLeadSFDC implements Serializable{
	
  	private static final long serialVersionUID = 1L;

	@JsonProperty("Status") 
    public String status;
    
    @JsonProperty("Message") 
    public String message;
    
    @JsonProperty("LeadId") 
    public String leadId;
    
    @JsonProperty("RefID") 
    public String refID;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public String getRefID() {
		return refID;
	}

	public void setRefID(String refID) {
		this.refID = refID;
	}
    
}
