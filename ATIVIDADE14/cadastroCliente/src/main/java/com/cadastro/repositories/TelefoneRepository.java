package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.entities.Telefone;

public interface TelefoneRepository  extends JpaRepository <Telefone,Long>{

}