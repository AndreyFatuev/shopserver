package com.fatuev.controller;

import com.fatuev.entity.Orderr;
import com.fatuev.service.OrderrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/Orderr")
public class OrderrController {

    @Autowired
    private OrderrService service;

    @RequestMapping(value = "/orderrs", method = RequestMethod.GET)
    @ResponseBody
    public List<Orderr> getAllOrderr() {
        return service.getAll();
    }

    @RequestMapping(value = "/saveOrderrs", method = RequestMethod.POST)
    @ResponseBody
    public Orderr saveOrderr(@RequestBody Orderr orderr) {
        return service.save(orderr);
    }

}
