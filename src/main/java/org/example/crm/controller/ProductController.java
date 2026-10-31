package org.example.crm.controller;

import org.example.crm.model.Product;
import org.example.crm.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @GetMapping("/get-products")
    List<Product> getProduct(){
        ProductServiceImpl service = new ProductServiceImpl();
        return service.getProductList();
    }
}
