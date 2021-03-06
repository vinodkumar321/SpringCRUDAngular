package com.jocata.tcl.dataloader.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jocata.tcl.dataloader.dao.CustomerDetailsDAO;
import com.jocata.tcl.dataloader.entity.CustomerDetails;
import com.jocata.tcl.dataloader.service.CustomerDetailsService;
import com.jocata.tcl.utils.request.CustomerDetailsRequestResponse;



@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	CustomerDetailsDAO customerDAO;
	
	@Override
	public CustomerDetailsRequestResponse saveCustomerDetails(CustomerDetailsRequestResponse request) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setMobilenumber(request.getMobilenumber());
		customerDetails.setPannumber(request.getPannumber());
		customerDetails.setFirstname(request.getFirstname());
		customerDetails.setMiddlename(request.getMiddlename());
		customerDetails.setLastname(request.getLastname());
		customerDetails.setFathername(request.getFathername());
		customerDetails.setDob(request.getDob());
		customerDetails.setPersonalemail(request.getPersonalemail());
		customerDetails.setGender(request.getGender());
		customerDetails.setPincode(request.getPincode());
		customerDetails.setKyccity(request.getKyccity());
		customerDetails.setKycstate(request.getKycstate());
		
		Serializable id =  customerDAO.save(customerDetails);
		customerDetails.setId((Integer) id);
		
		request.setAppId(customerDetails.getId());
		
		return request;
	}

	@Override
	public CustomerDetailsRequestResponse getCustomerDetails(Integer appId) {
		
		CustomerDetails request = new CustomerDetails();
		request = customerDAO.findEntityById(request, appId);
		
		CustomerDetailsRequestResponse customerDetails = new CustomerDetailsRequestResponse();
		
		if(request != null) {
			customerDetails.setAppId(appId);
			customerDetails.setMobilenumber(request.getMobilenumber());
			customerDetails.setPannumber(request.getPannumber());
			customerDetails.setFirstname(request.getFirstname());
			customerDetails.setMiddlename(request.getMiddlename());
			customerDetails.setLastname(request.getLastname());
			customerDetails.setFathername(request.getFathername());
			customerDetails.setDob(request.getDob());
			customerDetails.setPersonalemail(request.getPersonalemail());
			customerDetails.setGender(request.getGender());
			customerDetails.setPincode(request.getPincode());
			customerDetails.setKyccity(request.getKyccity());
			customerDetails.setKycstate(request.getKycstate());
		}
		
		return customerDetails;
	}

	@Override
	public CustomerDetailsRequestResponse updateCustomerDetails(CustomerDetailsRequestResponse request) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setId(request.getAppId());
		customerDetails.setMobilenumber(request.getMobilenumber());
		customerDetails.setPannumber(request.getPannumber());
		customerDetails.setFirstname(request.getFirstname());
		customerDetails.setMiddlename(request.getMiddlename());
		customerDetails.setLastname(request.getLastname());
		customerDetails.setFathername(request.getFathername());
		customerDetails.setDob(request.getDob());
		customerDetails.setPersonalemail(request.getPersonalemail());
		customerDetails.setGender(request.getGender());
		customerDetails.setPincode(request.getPincode());
		customerDetails.setKyccity(request.getKyccity());
		customerDetails.setKycstate(request.getKycstate());
		customerDetails.setLeadid(request.getLeadid());
		
		customerDAO.update(customerDetails);
		
		return request;
	}

}
