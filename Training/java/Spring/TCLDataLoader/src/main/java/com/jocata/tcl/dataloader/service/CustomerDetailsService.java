package com.jocata.tcl.dataloader.service;

import org.springframework.stereotype.Component;

import com.jocata.tcl.utils.request.CustomerDetailsRequestResponse;


@Component
public interface CustomerDetailsService {
	public CustomerDetailsRequestResponse saveCustomerDetails(CustomerDetailsRequestResponse request);
	public CustomerDetailsRequestResponse updateCustomerDetails(CustomerDetailsRequestResponse request);
	
	public CustomerDetailsRequestResponse getCustomerDetails(Integer appId);
}
