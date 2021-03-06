package com.jocata.las.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jocata.las.dao.CustomerDetailsDAO;
import com.jocata.las.entity.CustomerDetails;
import com.jocata.las.request.CustomerDetailsRequestResponse;
import com.jocata.las.service.CustomerDetailsService;

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
	public CustomerDetailsRequestResponse updateCustomerDetails(CustomerDetailsRequestResponse request,Integer Id) {
		CustomerDetails customerDetails = customerDAO.findEntityById(new CustomerDetails(), Id);
		
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
		customerDAO.update(customerDetails);
		//System.out.println("First name : "+cusDetails.getFirstname());
		return request;
	}

 	@Override
	public List<CustomerDetails> getCustomerDetailsAll() {
		List<CustomerDetails> customerList = new ArrayList<>();
		customerList = customerDAO.loadEntity(CustomerDetails.class);
		return customerList;
	}

  	@Override
	public CustomerDetailsRequestResponse deleteCustomerDetails(Integer appId) {
  		
		CustomerDetails customerDetails = customerDAO.findEntityById(new CustomerDetails(), appId);
		CustomerDetailsRequestResponse request = new CustomerDetailsRequestResponse();
		request.setMobilenumber(customerDetails.getMobilenumber());
		
		request.setPannumber(customerDetails.getPannumber());
		request.setFirstname(customerDetails.getFirstname());
		request.setMiddlename(customerDetails.getMiddlename());
		request.setLastname(customerDetails.getLastname());
		request.setFathername(customerDetails.getFathername());
		request.setDob(customerDetails.getDob());
		request.setPersonalemail(customerDetails.getPersonalemail());
		request.setGender(customerDetails.getGender());
		request.setPincode(customerDetails.getPincode());
		request.setKyccity(customerDetails.getKyccity());
		request.setKycstate(customerDetails.getKycstate());
		request.setAppId(appId);
	//	System.out.println("Mobile Number : "+request.getMobilenumber()+"\n First Name : "+request.getFirstname());
		customerDAO.delete(customerDetails);
		return request;
	}

}
