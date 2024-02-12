package com.MySQL.MySQL_template.controller;
import com.MySQL.MySQL_template.DAO.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.MySQL.MySQL_template.service.ProdService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProdService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Product findProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @GetMapping("/products/{name}")
    public Product findProductsByName(@PathVariable String name){
        return service.getProductByName(name);
    }
}

