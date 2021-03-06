package com.jocata.las.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jocata.las.entity.CustomerDetails;
import com.jocata.las.request.CustomerDetailsRequestResponse;

@Component
public interface CustomerDetailsService {
	public CustomerDetailsRequestResponse saveCustomerDetails(CustomerDetailsRequestResponse request);
	public CustomerDetailsRequestResponse updateCustomerDetails(CustomerDetailsRequestResponse request,Integer Id);
	
	public CustomerDetailsRequestResponse getCustomerDetails(Integer appId);
	public CustomerDetailsRequestResponse deleteCustomerDetails(Integer appId);
	public List<CustomerDetails> getCustomerDetailsAll();
	
}
