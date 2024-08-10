package com.thinklikepro.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinklikepro.ecommerce.model.Products;
import com.thinklikepro.ecommerce.service.ProductsService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductsService productsService;
	
	@PostMapping
	public Object addProducts(@RequestBody Products products) {
				
		Products savedProducts =productsService.saveProducts(products);
		
		if(savedProducts!=null) {
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProducts);
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public ResponseEntity<List<Products>> getAllProduct() {
		
		return productsService.getProducts();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Products> getProductById(@PathVariable Long id) {
		
		return productsService.getProductsById(id);
	}
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Products> updateProduct(@PathVariable Long id, @RequestBody Products products) {
		Optional<Products> getproducts = productsService.getProductsById(id);
		Products product=getproducts.orElse(null);
		if(product !=null) {
			product.setProductName(products.getProductName());
			product.setPrice(products.getPrice());
			product.setDescription(products.getDescription());
		}
		
		Products saveProduct=productsService.saveProducts(product);
		
		if(saveProduct!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(saveProduct);
			}
			
			return (ResponseEntity<Products>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
		
		boolean deletedProduct =productsService.deleteProduct(id);
		if(deletedProduct) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
