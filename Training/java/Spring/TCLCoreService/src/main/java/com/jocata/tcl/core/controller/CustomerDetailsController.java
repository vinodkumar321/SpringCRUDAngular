package com.jocata.tcl.core.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.tcl.core.service.CreateLeadService;
import com.jocata.tcl.dataloader.service.CustomerDetailsService;
import com.jocata.tcl.utils.request.CreateLeadRequest;
import com.jocata.tcl.utils.request.CustomerDetailsRequestResponse;
import com.jocata.tcl.utils.response.CreateLeadResponse;



@RestController
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService customerService;
	
	@Autowired
	CreateLeadService createLeadService;
	
	@PostMapping("/v0.1/saveCustomerDetails")
	public ResponseEntity<?> saveCustomerDetails(@RequestBody CustomerDetailsRequestResponse request){
	
		CustomerDetailsRequestResponse response= request; //pass/assing the ref
		response = customerService.saveCustomerDetails(request);	//response contains new PK
		
		//call createLead with the saved Details -> get the lead id generated and set to request
		CreateLeadRequest leadRequest = new CreateLeadRequest();
		leadRequest.setRefId(response.getAppId()+"_"+new Date().getTime());	
		leadRequest.setFirstName(response.getFirstname());
		leadRequest.setMiddleName(response.getMiddlename());
		leadRequest.setLastName(response.getLastname());
		leadRequest.setMobileNo(response.getMobilenumber());
		leadRequest.setEmailId(response.getPersonalemail());
		leadRequest.setPincode(response.getPincode());
		leadRequest.setCity(response.getKyccity());
		leadRequest.setState(response.getKycstate());
		leadRequest.setPan(response.getPannumber());
		leadRequest.setSource("email");
		leadRequest.setSubsource("email");
		leadRequest.setProduct("LOAN AGAINST SHARE");
		
		
		CreateLeadResponse leadResponse = createLeadService.createLead(leadRequest);
		if(leadResponse !=null) {
			response.setLeadid(leadResponse.getlAS_Create_Lead_SFDC().getLeadId());
			response = customerService.updateCustomerDetails(response);
			//response.setLeadid(leadResponse.getlAS_Create_Lead_SFDC().getLeadId());
		}
		
		return new ResponseEntity<CustomerDetailsRequestResponse>(response, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/v0.1/getCustomerDetails")
	public ResponseEntity<?> getCustomerDetails(@RequestBody CustomerDetailsRequestResponse request){
	
		request = customerService.getCustomerDetails(request.getAppId());		
		return new ResponseEntity<CustomerDetailsRequestResponse>(request, HttpStatus.ACCEPTED);
	}
	
}
