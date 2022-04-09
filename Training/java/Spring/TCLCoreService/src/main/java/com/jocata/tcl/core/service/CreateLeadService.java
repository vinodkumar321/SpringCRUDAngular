package com.jocata.tcl.core.service;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jocata.tcl.utils.request.CreateLeadRequest;
import com.jocata.tcl.utils.response.CreateLeadResponse;


@Service
public class CreateLeadService {

	public CreateLeadResponse createLead(CreateLeadRequest leadRequest) {
		
		//1. generate json string from the req object pojo
		ObjectMapper mapper = new ObjectMapper();
		String requestString = null;
		
		try{
			requestString = mapper.writeValueAsString(leadRequest);
		}catch(Exception e) {e.printStackTrace();}
		
		JSONObject json = new JSONObject(requestString);
		
		//2. get the url for the rest api to call
		String url = "http://127.0.0.1:8082/clientservices/v0.1/createLead";
		
		//3. generate headers requried to be passed
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		headers.add("Accept-Encoding", "gzip,deflate");
		
		//4. create HttpEntity object with above jsonstring, headers to be passed in request
		HttpEntity<String> reqEntity = new HttpEntity<String>(json.toString(), headers);
		
		//5. create RestTemplate object, call postForObject method with above request, get response
		RestTemplate restTemplate = new RestTemplate();
		CreateLeadResponse leadResponse = restTemplate.postForObject(url, reqEntity, CreateLeadResponse.class);
		
		//6. return the response received from restTemplate
		return leadResponse;
	}
}
