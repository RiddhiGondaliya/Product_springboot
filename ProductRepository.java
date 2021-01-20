package com.example.Product;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product>findByProductName(String productName);
    Product findById(long id);
}
