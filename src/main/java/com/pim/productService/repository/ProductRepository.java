package com.pim.productService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pim.productService.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findByPname(String pname);
}
