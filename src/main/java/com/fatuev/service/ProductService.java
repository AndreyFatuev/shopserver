package com.fatuev.service;

import com.fatuev.entity.Product;

import java.util.List;

/**
 * Created by Андрей on 23.05.2017.
 */
public interface ProductService {

    List<Product> getAll();
    Product save(Product product);

}
