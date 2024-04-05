package com.pim.productService.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pim.productService.model.Product;
import com.pim.productService.repository.ProductRepository;
import com.pim.productService.serviceInterce.ProductServiceInterface;

@Service
public class ProductService implements ProductServiceInterface{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> ListOfProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findByPname(String pname) {
	
		return productRepository.findByPname(pname)
				.orElseThrow(() -> new RuntimeException("Product Not Found"));
	}

	@Override
	public Product saveProduct(Product p) {
		
		return productRepository.save(p);
	}

	@Override
	public Product updateProduct(Product p, Long pid) {
		Product existingProduct = productRepository.findById(pid)
							.orElseThrow(() -> new RuntimeException("No Product available with Id"+pid));
		if (existingProduct != null) {
			existingProduct.setPname(p.getPname());
		}	existingProduct.setPrice(p.getPrice());
			existingProduct.setQuantity(p.getQuantity());
		
		return productRepository.save(existingProduct);
	}

	@Override
	public void deleteProduct(Long pid) {
		
		if (pid != 0) {
			productRepository.deleteById(pid);
		}
		
	}
	
	
	
}
