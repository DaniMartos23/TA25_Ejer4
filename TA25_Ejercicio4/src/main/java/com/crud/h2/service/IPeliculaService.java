package com.crud.h2.service;

import java.util.List;
import com.crud.h2.dto.Pelicula;

public interface IPeliculaService {
	//Metodos del CRUD
		public List<Pelicula> listarPeliculas(); //Listar All 
		
		public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda un pelicula CREATE
		
		public Pelicula peliculaXID(int id); //Leer datos de un pelicula READ
		
		public List<Pelicula> listarPeliculaNombre(String nombre);//Listar Peliculas por campo nombre
		
		public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos del pelicula UPDATE
		
		public void eliminarPelicula(int id);// Elimina el pelicula DELETE
}
