package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @GetMapping("/get-products")
    List<Product> getProduct(){
        ProductServiceImpl service = new ProductServiceImpl();
        List<Product> productList = service.getProductList();
        return productList;
    }
}
