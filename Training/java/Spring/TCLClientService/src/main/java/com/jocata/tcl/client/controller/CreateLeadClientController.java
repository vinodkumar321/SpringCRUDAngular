package com.jocata.tcl.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.tcl.client.service.CreateLeadClientService;
import com.jocata.tcl.utils.request.CreateLeadRequest;
import com.jocata.tcl.utils.response.CreateLeadResponse;

@RestController
public class CreateLeadClientController {

	@Autowired
	CreateLeadClientService createLeadService;
	
	@PostMapping("/v0.1/createLead")
	public ResponseEntity<?> createLead(@RequestBody CreateLeadRequest leadRequest){
		CreateLeadResponse leadResponse = createLeadService.createLead(leadRequest);
		return new ResponseEntity<CreateLeadResponse>(leadResponse, HttpStatus.OK);
	}
}
