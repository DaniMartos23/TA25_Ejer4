package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Sala;

public interface ISalaService {
	//Metodos del CRUD
	public List<Sala> listarSalas(); //Listar All 
	
	public Sala guardarSala(Sala sala);	//Guarda un sala CREATE
	
	public Sala salaXID(int id); //Leer datos de un sala READ
			
	public List<Sala> listarSalaNombre(String nombre);//Listar Salas por campo nombre
			
	public Sala actualizarSala(Sala sala); //Actualiza datos del sala UPDATE
			
	public void eliminarSala(int id);// Elimina el sala DELETE
}
