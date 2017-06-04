package com.fatuev.service;

import com.fatuev.entity.Orderr;

import java.util.List;

/**
 * Created by Андрей on 23.05.2017.
 */
public interface OrderrService {

    List<Orderr> getAll();
    Orderr save(Orderr orderr);

}

