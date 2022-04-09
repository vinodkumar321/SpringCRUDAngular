package com.jocata.tcl.delegator.controller;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jocata.tcl.utils.request.CustomerDetailsRequestResponse;

@RestController
public class CustomerDetailsDelegatorController {
	
	@PostMapping("/v0.1/saveCustomerDetails")
	public ResponseEntity<?> saveCustomerDetails(@RequestBody CustomerDetailsRequestResponse request){
	
		//1. generate json string from the req object pojo
		ObjectMapper mapper = new ObjectMapper();
		String requestString = null;
				
		try{
			requestString = mapper.writeValueAsString(request);
		}catch(Exception e) {e.printStackTrace();}
				
		JSONObject json = new JSONObject(requestString);
				
		//2. get the url for the rest api to call
		String url = "http://127.0.0.1:8081/coreservices/v0.1/saveCustomerDetails";
				
		//3. generate headers requried to be passed
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		headers.add("Accept-Encoding", "gzip,deflate");
		
		//4. create HttpEntity object with above jsonstring, headers to be passed in request
		HttpEntity<String> reqEntity = new HttpEntity<String>(json.toString(), headers);
				
		//5. create RestTemplate object, call postForObject method with above request, get response
		RestTemplate restTemplate = new RestTemplate();
		CustomerDetailsRequestResponse response= restTemplate.postForObject(url, reqEntity, CustomerDetailsRequestResponse.class);
		
		return new ResponseEntity<CustomerDetailsRequestResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/v0.1/getCustomerDetails")
	public ResponseEntity<?> getCustomerDetails(@RequestBody CustomerDetailsRequestResponse request){
	
		//1. generate json string from the req object pojo
		ObjectMapper mapper = new ObjectMapper();
		String requestString = null;
				
		try{
			requestString = mapper.writeValueAsString(request);
		}catch(Exception e) {e.printStackTrace();}
				
		JSONObject json = new JSONObject(requestString);
				
		//2. get the url for the rest api to call
		String url = "http://127.0.0.1:8081/coreservices/v0.1/getCustomerDetails";
				
		//3. generate headers requried to be passed
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		headers.add("Accept-Encoding", "gzip,deflate");
				
		//4. create HttpEntity object with above jsonstring, headers to be passed in request
		HttpEntity<String> reqEntity = new HttpEntity<String>(json.toString(), headers);
				
		//5. create RestTemplate object, call postForObject method with above request, get response
		RestTemplate restTemplate = new RestTemplate();
		CustomerDetailsRequestResponse response= restTemplate.postForObject(url, reqEntity, CustomerDetailsRequestResponse.class);
		
		return new ResponseEntity<CustomerDetailsRequestResponse>(response, HttpStatus.OK);
	}
	
	

}
