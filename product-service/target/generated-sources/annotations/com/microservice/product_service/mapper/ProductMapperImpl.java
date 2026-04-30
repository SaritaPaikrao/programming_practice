package com.microservice.product_service.mapper;

import com.microservice.product_service.entity.Product;
import com.microservice.product_service.models.ProductPojo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T15:39:47+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductPojo productPojo) {
        if ( productPojo == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productPojo.getProductId() );
        product.setProductName( productPojo.getProductName() );
        product.setPrice( productPojo.getPrice() );

        return product;
    }

    @Override
    public ProductPojo toProductPojo(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductPojo productPojo = new ProductPojo();

        productPojo.setProductId( product.getProductId() );
        productPojo.setProductName( product.getProductName() );
        productPojo.setPrice( product.getPrice() );

        return productPojo;
    }

    @Override
    public List<ProductPojo> toProductPojoList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductPojo> list = new ArrayList<ProductPojo>( products.size() );
        for ( Product product : products ) {
            list.add( toProductPojo( product ) );
        }

        return list;
    }
}
