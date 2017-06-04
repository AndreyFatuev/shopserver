package com.fatuev.service;

import com.fatuev.entity.Product;
import com.fatuev.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository_product;

    @Transactional(readOnly=true)
    public List<Product> getAll() {
        return repository_product.findAll();
    }

    public Product save(Product product) {
        return repository_product.saveAndFlush(product);
    }

}
