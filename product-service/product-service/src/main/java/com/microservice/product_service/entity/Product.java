package com.microservice.product_service.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    Integer productId;
    @Column(name = "product_name")
    String productName;
    @Column(name = "product_price")
    Long price;

}
