package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculasDAO;
import com.crud.h2.dto.Pelicula;



@Service
public class PeliculaServiceImpl implements IPeliculaService {

	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IPeliculasDAO iPeliculasDAO;
		
	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int id) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public List<Pelicula> listarPeliculaNombre(String nombre) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findByNombre(nombre);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int id) {
		// TODO Auto-generated method stub
		iPeliculasDAO.deleteById(id);
	}

}
