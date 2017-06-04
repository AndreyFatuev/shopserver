package com.fatuev.service;

import com.fatuev.entity.Client;

import java.util.List;

/**
 * Created by Андрей on 23.05.2017.
 */
public interface ClientService {

    List<Client> getAll();
    Client save(Client client);
}
