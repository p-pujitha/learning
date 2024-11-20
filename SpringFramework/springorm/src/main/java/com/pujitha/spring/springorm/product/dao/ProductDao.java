package com.pujitha.spring.springorm.product.dao;

import com.pujitha.spring.springorm.entities.Product;

import java.util.List;

public interface ProductDao {
    int create(Product product);

    void update(Product product);

    void delete(Product product);

    Product find(int id);

    List<Product> findAll();
}
