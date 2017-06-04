package com.fatuev.service;

import com.fatuev.entity.Orderr;
import com.fatuev.repository.OrderrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderrServiceImpl implements OrderrService{

    @Autowired
    private OrderrRepository repository_orderr;

    @Transactional(readOnly=true)
    public List<Orderr> getAll() {
        return repository_orderr.findAll();
    }

    public Orderr save(Orderr orderr) {
        return repository_orderr.saveAndFlush(orderr);
    }
}
