package com.fatuev.repository;

import com.fatuev.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository <Client,Long> {
}
