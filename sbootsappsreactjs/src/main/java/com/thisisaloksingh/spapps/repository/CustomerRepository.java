package com.thisisaloksingh.spapps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thisisaloksingh.spapps.pojo.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
	
	@Query(value="select * from customers",nativeQuery= true )
	public List<Customers> findAllCust();
	
}
