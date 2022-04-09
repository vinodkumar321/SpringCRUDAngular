package com.jocata.las.clientservice;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jocata.las.request.CreateLeadRequest;
import com.jocata.las.response.CreateLeadResponse;

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
		String url = "https://apicast-uat-jocatafrontendadapter.tclnprdservice.tatacapital.com/rest/jocata/v1.0/aggregatorcreateleadsfdc";
		
		//3. generate headers requried to be passed
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		headers.add("Accept-Encoding", "gzip,deflate");
		headers.add("ConversationID", "Jocata_LAS_"+new Date().getTime());
		headers.add("SourceName", "Jocata");
		headers.add("Authorization", "Basic MTNlMzkxNzY6am9jYXRhdWF0");
		
		
		//4. create HttpEntity object with above jsonstring, headers to be passed in request
		HttpEntity<String> reqEntity = new HttpEntity<String>(json.toString(), headers);
		
		//5. create RestTemplate object, call postForObject method with above request, get response
		RestTemplate restTemplate = new RestTemplate();
		CreateLeadResponse leadResponse = restTemplate.postForObject(url, reqEntity, CreateLeadResponse.class);
		
		//6. return the response received from restTemplate
		return leadResponse;
	}
}
