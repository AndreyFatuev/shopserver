package com.fatuev.controller;

import com.fatuev.entity.Client;
import com.fatuev.repository.ClientRepository;
import com.fatuev.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/Client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientService service;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> getAllClients() {
        return service.getAll();
    }

    @RequestMapping(value = "/saveClients", method = RequestMethod.POST)
    @ResponseBody
    public Client saveClient(@RequestBody Client client) {
        return service.save(client);
    }


/*    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Client> getAllUsers() {
        // This returns a JSON or XML with the users
        return clientRepository.findAll();
    }*/
}