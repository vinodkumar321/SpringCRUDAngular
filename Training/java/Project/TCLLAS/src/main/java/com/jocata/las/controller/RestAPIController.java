package com.jocata.las.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.las.request.HelloRequest;
import com.jocata.las.response.HelloResponse;

@RestController
public class RestAPIController { //a controller who serves as rest api and returns json

	
	@GetMapping("/helloRestAPI")
	public ResponseEntity<?> helloRestAPI(@RequestBody String jsonReq){
		//{"callerName":"Ram Shankar"}
		
		JSONObject json = new JSONObject(jsonReq);
		String callerName = json.getString("callerName");
		String respString = "Hello " + callerName + ", Welcome to Rest API Spring Boot";
		
		JSONObject jsonRes = new JSONObject("{}");
		jsonRes.put("helloMessage", respString);
		
		return new ResponseEntity<String>(jsonRes.toString(), HttpStatus.OK);		
	}
	
	@GetMapping("/getHelloMessage")
	public ResponseEntity<?> getHelloMessage(@RequestBody HelloRequest request){
	//public ResponseEntity<?> getHelloMessage(@RequestBody String jsonReq){
	//	ObjectMapper mapper = new ObjectMapper();
	//	HelloRequest request = null;
	//	try{
	//		request = mapper.readValue(jsonReq, HelloRequest.class);			
	//	}catch(Exception e) {e.printStackTrace();}
		
		HelloResponse response = new HelloResponse();
		response.setHelloMessage("Hello!! " + request.getCallerName() + ", Welcome to REST API Spring Boot APP");

		return new ResponseEntity<HelloResponse>(response, HttpStatus.OK);
	}
	
	
	
}
