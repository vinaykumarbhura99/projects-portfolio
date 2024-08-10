package com.thinklikepro.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.thinklikepro.ecommerce.model.Products;
import com.thinklikepro.ecommerce.repository.ProductRepository;



@Service
public class ProductsService {
	
	@Autowired
	private ProductRepository productRepository;

	public ResponseEntity<List<Products>> getProducts() {
		List<Products> products=productRepository.findAll();
		return ResponseEntity.ok(products);
	}

	public Products saveProducts(Products products) {	
		return productRepository.save(products);
		
	}

	public Optional<Products> getProductsById(Long id) {
	Optional<Products> products = productRepository.findById(id);
		return products;
	}

	public boolean deleteProduct(Long id) {
		if(productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	

}
