package org.example.crm.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private String productName;
    private String productDescription;
    private Double productPrice;
    private String imageUrl;
}
