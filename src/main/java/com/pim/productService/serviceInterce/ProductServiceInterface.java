package com.pim.productService.serviceInterce;

import java.util.List;

import com.pim.productService.model.Product;

public interface ProductServiceInterface {

	List<Product> ListOfProducts();
	Product findByPname(String pname);
	Product saveProduct(Product p);
	Product updateProduct(Product p , Long pid);
	void deleteProduct(Long pid);
}
