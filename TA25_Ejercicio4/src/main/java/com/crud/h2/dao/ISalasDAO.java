package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Sala;

public interface ISalasDAO extends JpaRepository<Sala, Integer> {
	//Listar articulos por campo nombre
			public List<Sala> findByNombre(String nombre);
}
