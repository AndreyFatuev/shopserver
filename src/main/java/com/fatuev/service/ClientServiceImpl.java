package com.fatuev.service;

import com.fatuev.entity.Client;
import com.fatuev.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository_client;
    @Transactional(readOnly=true)
    public List<Client> getAll() {
        return repository_client.findAll();
    }

    public Client save(Client client) {
        return repository_client.saveAndFlush(client);
    }

}
