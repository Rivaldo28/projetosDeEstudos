package com.crescendo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crescendo.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}
