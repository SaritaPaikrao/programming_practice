package com.microservice.product_service.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPojo {
    Integer productId;
    String productName;
    Long price;
}
