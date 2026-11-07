package org.example.crm.service;

import org.example.crm.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl {

    public void createProduct(Product product){

    }

    public List<Product> getProductList(){
        return Arrays.asList(
                new Product("T-Shirt", "Men's T-Shirt", 500.0, null, true),
                new Product("B-Shirt", "Men's B-Shirt", 700.0, null, true),
                new Product("C-Shirt", "Men's C-Shirt", 1200.0,
                        "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_t.png", true)

        );
    }
}
