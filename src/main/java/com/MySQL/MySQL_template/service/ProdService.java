package com.MySQL.MySQL_template.service;

import com.MySQL.MySQL_template.DAO.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MySQL.MySQL_template.repo.ProdRepo;

import java.util.List;

@Service
public class ProdService {
    @Autowired
    private ProdRepo repos;

    public Product saveProduct(Product product) {
        return repos.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return repos.saveAll(products);
    }
    public List<Product> getProducts(){
        return repos.findAll();
    }
    public Product getProductById(int id){
        return repos.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repos.findByName(name);
    }
    public String deleteProduct(int id){
        repos.deleteById(id);
        return "product removed"+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct=repos.findById(product.getId()).orElse(product);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repos.save(existingProduct);
    }



}
