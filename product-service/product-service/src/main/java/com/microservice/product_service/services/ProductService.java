package com.microservice.product_service.services;

import com.microservice.product_service.entity.Product;
import com.microservice.product_service.mapper.ProductMapper;
import com.microservice.product_service.models.ProductPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.product_service.repository.ProdcutRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    ProdcutRepository prodcutRepository;
    @Autowired
    ProductMapper productMapper;
    public ProductPojo saveProduct(ProductPojo productPojo) {
        ProductPojo pojo = new ProductPojo();
        try {
            Product product = productMapper.toEntity(productPojo);
          pojo = productMapper.toProductPojo(prodcutRepository.save(product));
        } catch (Exception e) {
            e.getStackTrace();
            throw new IllegalStateException("Mapping failed : entity is null.");

        }
    return pojo;
    }

    public List<ProductPojo> getProductList() {
        List<Product> products = prodcutRepository.findAll();
        List<ProductPojo> productList = productMapper.toProductPojoList(products);
            return productList;
    }
}
