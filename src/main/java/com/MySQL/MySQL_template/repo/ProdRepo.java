package com.MySQL.MySQL_template.repo;

import com.MySQL.MySQL_template.DAO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepo extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
