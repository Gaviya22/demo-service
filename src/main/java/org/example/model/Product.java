package org.example.model;

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
}
