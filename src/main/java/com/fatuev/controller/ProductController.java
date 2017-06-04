package com.fatuev.controller;

import com.fatuev.entity.Product;
import com.fatuev.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/Product")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    @RequestMapping(value = "/saveProducts", method = RequestMethod.POST)
    @ResponseBody
    public Product saveProduct(@RequestBody Product product) {
        return service.save(product);
    }

}
