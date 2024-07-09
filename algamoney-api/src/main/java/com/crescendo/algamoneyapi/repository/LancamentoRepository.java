package com.crescendo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crescendo.algamoneyapi.model.Lancamento;
import com.crescendo.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
