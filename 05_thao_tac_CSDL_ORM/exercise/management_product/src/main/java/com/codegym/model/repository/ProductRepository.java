package com.codegym.model.repository;

import com.codegym.model.bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void update( Product product);

    void remove(Product product);
}
