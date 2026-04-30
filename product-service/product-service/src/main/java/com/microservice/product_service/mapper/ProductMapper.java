package com.microservice.product_service.mapper;

import com.microservice.product_service.entity.Product;
import com.microservice.product_service.models.ProductPojo;
import org.mapstruct.Mapper;

import java.util.List;

//@Component
@Mapper(componentModel = "spring")
public interface ProductMapper {
    //@Select("SELECT * FROM product WHERE product_id = #{productId}")
    Product toEntity(ProductPojo productPojo);
    ProductPojo toProductPojo(Product product);
    List<ProductPojo> toProductPojoList(List<Product> products);
}
