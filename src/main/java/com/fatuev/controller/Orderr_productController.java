package com.fatuev.controller;

import com.fatuev.entity.Orderr_product;
import com.fatuev.service.Orderr_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/Orderr_product")
public class Orderr_productController {

    @Autowired
    private Orderr_productService service;

    @RequestMapping(value = "/orderr_products", method = RequestMethod.GET)
    @ResponseBody
    public List<Orderr_product> getAllOrderr_products() {
        return service.getAll();
    }

    @RequestMapping(value = "/saveOrderr_products", method = RequestMethod.POST)
    @ResponseBody
    public Orderr_product saveOrderr_product(@RequestBody Orderr_product orderr_product) {
        return service.save(orderr_product);
    }

}
