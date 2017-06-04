package com.fatuev.service;

import com.fatuev.entity.Orderr_product;
import com.fatuev.repository.Orderr_ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Orderr_productServiceImpl implements Orderr_productService {

    @Autowired
    private Orderr_ProductRepository repository_orderr_product;

    @Transactional(readOnly=true)
    public List<Orderr_product> getAll() {
        return repository_orderr_product.findAll();
    }

    public Orderr_product save(Orderr_product orderr_product) {
        return repository_orderr_product.saveAndFlush(orderr_product);
    }


}
