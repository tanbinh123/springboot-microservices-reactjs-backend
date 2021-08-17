package com.thisisaloksingh.spapps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thisisaloksingh.spapps.pojo.Product;
import com.thisisaloksingh.spapps.service.IProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ProductController {
	
	//try-catch ,exception handling for each execution insert update delete  ??
	//checked n unchecked ??
	//custom execption ??
	
	
	
	
	@Autowired
	private IProductService productService;

	@RequestMapping(value="/product",method=RequestMethod.GET)
	public List<Product> getProduct() {
		List<Product> products = productService.findAll();
		return products;
	}
	
//	@RequestMapping //??
//	@PathVariable //??
	@GetMapping(value="/id")
	public Optional<Product> getProductId(@RequestParam(value="id",defaultValue="100") int id){
		Optional<Product> products = productService.findById(id);
		return products;
	}
	
	@PostMapping(value="/insert_product")
	public void insertProduct(@RequestBody Product product){
		productService.insert(product);
	}
	
	@RequestMapping(value="/update_product/{id}",method=RequestMethod.PUT)
	public void updateProduct(@PathVariable int id){
		productService.update(id);
	}
	
	@RequestMapping(value="/delete_product",method=RequestMethod.DELETE)
	public void deleteProduct(@RequestParam(value="id",defaultValue="100") int id){
		productService.delete(id);
	}
}