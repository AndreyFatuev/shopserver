package com.fatuev.service;

import com.fatuev.entity.Orderr_product;

import java.util.List;

/**
 * Created by Андрей on 23.05.2017.
 */
public interface Orderr_productService {

    List<Orderr_product> getAll();
    Orderr_product save(Orderr_product orderr_product);
}
