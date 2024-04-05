package com.pim.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pim.productService.model.Product;
import com.pim.productService.serviceInterce.ProductServiceInterface;

@RestController
@CrossOrigin(origins = "*") 
public class ProductController {

	@Autowired
	private ProductServiceInterface productServiceInterface;
	
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return productServiceInterface.ListOfProducts();
	}
	
	@GetMapping("/products/{pname}")
	public ResponseEntity<Product> findByProductName(@PathVariable String pname) {
		return new ResponseEntity<Product>(productServiceInterface.findByPname(pname), HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product p) {
		return productServiceInterface.saveProduct(p);
	}
	
	@PutMapping("/products/{pid}")
	public Product updateProduct(@RequestBody Product p, @PathVariable Long pid) {
		return productServiceInterface.updateProduct(p, pid);	
	}
	
	@DeleteMapping("/products/{pid}")
	public void deleteProduct(@PathVariable Long pid) {
		productServiceInterface.deleteProduct(pid);	
	}
}
