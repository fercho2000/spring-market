package com.platzimarket.web.controller;

import com.platzimarket.domain.Product;
import com.platzimarket.domain.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServices productServices;


    public List<Product> getAll() {

        return productServices.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productServices.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {

        return productServices.getByCategory(categoryId);
    }


    public Product save(Product product) {
        return productServices.save(product);
    }

    public boolean delete(int productId) {

        return productServices.delete(productId);
    }


}
