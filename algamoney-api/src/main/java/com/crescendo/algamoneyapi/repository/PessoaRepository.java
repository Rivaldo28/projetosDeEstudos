package com.crescendo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crescendo.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
