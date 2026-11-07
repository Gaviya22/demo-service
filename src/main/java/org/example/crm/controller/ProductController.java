package org.example.crm.controller;

import org.example.crm.model.Product;
import org.example.crm.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    ProductServiceImpl service;

    ProductController(ProductServiceImpl service){
        this.service = service;
    }

    @GetMapping("/product/all")
    List<Product> getProduct(){
        return service.getProductList();
    }

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        System.out.println(product);
    }
}
