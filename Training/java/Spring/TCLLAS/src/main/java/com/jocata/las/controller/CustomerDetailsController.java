package com.jocata.las.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jocata.las.entity.CustomerDetails;
import com.jocata.las.request.CreateLeadRequest;
import com.jocata.las.request.CustomerDetailsRequestResponse;
import com.jocata.las.response.CreateLeadResponse;
import com.jocata.las.service.CustomerDetailsService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService customerService;
	
	
	@PostMapping("/saveCustomerDetails")
	public ResponseEntity<?> saveCustomerDetails(@RequestBody CustomerDetailsRequestResponse request){
	
		
		request = customerService.saveCustomerDetails(request);	//response contains new PK

		
		return new ResponseEntity<CustomerDetailsRequestResponse>(request, HttpStatus.ACCEPTED);
	}

	
	@RequestMapping( value = {"/getCustomerDetailsByCustomerId/{id}" , "/updateCustomerDetailsByCustomerId/{id}" } , method = RequestMethod.GET )
	public ResponseEntity<?> getCustomerDetails(@PathVariable(value = "id") Integer Id){
		CustomerDetailsRequestResponse request = this.customerService.getCustomerDetails(Id);		
		return new ResponseEntity<CustomerDetailsRequestResponse>(request, HttpStatus.ACCEPTED);
	} 
	
	@PutMapping("/updateCustomerDetailsByCustomerId/{id}")
	public ResponseEntity<?> updateCustomerDetails(@RequestBody CustomerDetailsRequestResponse request,@PathVariable (value="id") Integer id){
	    request.setAppId(id);
		request = customerService.updateCustomerDetails(request,id);	
		
		return new ResponseEntity<CustomerDetailsRequestResponse>(request, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteCustomerDetailsByCustomerId/{id}")
	public ResponseEntity<?> deleteCustomerDetails(@PathVariable (value = "id") Integer id){
		CustomerDetailsRequestResponse request = this.customerService.deleteCustomerDetails(id);
		return new ResponseEntity<CustomerDetailsRequestResponse>(request, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/getCustomerDetailsAll")
	public List<CustomerDetails> getCustomerDetailsAll(){
		  return this.customerService.getCustomerDetailsAll(); 
	  } 
}
