package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.entities.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente,Long>{

}