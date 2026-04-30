package com.microservice.product_service.controller;

import com.microservice.product_service.models.ProductPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservice.product_service.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productServcie;

    //http://localhost:8080/product/addProduct
    @PostMapping("/addProduct")
    public ResponseEntity<ProductPojo> addProduct(@RequestBody ProductPojo productPojo) {
    ProductPojo product = productServcie.saveProduct(productPojo);
    return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    //http://localhost:8080/product/c
    @GetMapping("/getProductList")
    public ResponseEntity<List<ProductPojo>> getProductList() {
        List<ProductPojo> productList = productServcie.getProductList();
        return new ResponseEntity<>(productList, HttpStatus.ACCEPTED);
    }
}
