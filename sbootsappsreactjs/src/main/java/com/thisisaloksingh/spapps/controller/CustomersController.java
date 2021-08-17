package com.thisisaloksingh.spapps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thisisaloksingh.spapps.pojo.Customers;
import com.thisisaloksingh.spapps.service.impl.CustomersService;

@RestController
//@RequestMapping("/customers")
public class CustomersController {
	
	@Autowired
	CustomersService customersservice;
	
//	@GetMapping(value="/custid")
//	public Optional<Customers> findById(@RequestParam(value="custid",defaultValue="100") Integer custid){
	
	@RequestMapping(value="/customers/{custid}",method = RequestMethod.GET)
	public Optional<Customers> findById(@PathVariable Integer custid){
		return customersservice.findById(custid);
	}
	
	@RequestMapping(value="/all_cust",method=RequestMethod.GET)
	public List<Customers> findAllCust(){
		return customersservice.findAllCust();
	}

}
