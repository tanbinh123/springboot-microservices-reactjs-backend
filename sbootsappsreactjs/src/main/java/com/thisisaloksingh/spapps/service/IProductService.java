package com.thisisaloksingh.spapps.service;

import java.util.List;
import java.util.Optional;

import com.thisisaloksingh.spapps.pojo.Product;

public interface IProductService {
	List<Product> findAll();

	Optional<Product> findById(int id);

	String insert(Product product);

	void delete(int id);

	void update(int id);
}