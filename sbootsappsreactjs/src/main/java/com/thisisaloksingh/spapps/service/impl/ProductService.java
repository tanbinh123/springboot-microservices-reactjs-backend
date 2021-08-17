package com.thisisaloksingh.spapps.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thisisaloksingh.spapps.pojo.Product;
import com.thisisaloksingh.spapps.repository.ProductRepository;
import com.thisisaloksingh.spapps.service.IProductService;

@Service
//@Component
public class ProductService implements IProductService {
	
	@Autowired(required=true)
	ProductRepository productrepository;
	
	@Override
	public List<Product> findAll() {
		return (List<Product>)productrepository.findAll();
	}

	@Override
	public Optional<Product> findById(int id) {
		return productrepository.findById(id);
	}

	@Override
	public String insert(Product product) {
		if (product!=null) {
			productrepository.save(product);
			return "Added to Product!";
		}else{
			return "Request does not contain body!";
		}
	}

	@Override
	public void delete(int id) {
		if(id!=0){
			productrepository.deleteById(id);
		}else{
			System.out.println("Request does not contain body!");
		}
	}

	@Override
	public void update(int id) {
		if (id != 0) {
			Product product = productrepository.findById(id).get();
			product.setPrice(99);
			productrepository.save(product);
		} else {
			System.out.println("WARNING! Request does not contain body!");
		}

	}
}
