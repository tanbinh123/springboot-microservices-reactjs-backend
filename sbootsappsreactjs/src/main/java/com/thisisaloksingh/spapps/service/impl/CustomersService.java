package com.thisisaloksingh.spapps.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thisisaloksingh.spapps.pojo.Customers;
import com.thisisaloksingh.spapps.repository.CustomerRepository;

@Service
public class CustomersService {
	
	@Autowired(required=true)
	CustomerRepository customerrepositry;
	
	
	public Optional<Customers> findById(Integer custid){
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&CustomersService.findById()");
			return (Optional<Customers>)customerrepositry.findById(custid);
	}
	public List<Customers> findAllCust(){
		return customerrepositry.findAllCust();
	}

}
