package com.thinklikepro.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.thinklikepro.ecommerce.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
