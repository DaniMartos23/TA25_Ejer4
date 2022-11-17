package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Pelicula;

public interface IPeliculasDAO extends JpaRepository<Pelicula, Integer> {
	
	//Listar fabricantes por campo nombre
		public List<Pelicula> findByNombre(String nombre);
}
