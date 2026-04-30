package com.microservice.product_service.repository;

import com.microservice.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdcutRepository extends JpaRepository<Product, Integer>{
}
