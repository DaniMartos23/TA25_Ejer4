package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Pelicula;
import com.crud.h2.service.PeliculaServiceImpl;


@RestController
@RequestMapping("/api")

public class PeliculasController {
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	//listar peliculas por campo nombre
	@GetMapping("/peliculas/nombre/{nombre}")
	public List<Pelicula> listarPeliculaNombre(@PathVariable(name="nombre") String nombre) {
	    return peliculaServiceImpl.listarPeliculaNombre(nombre);
	}
	
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula PeliculaXID(@PathVariable(name="codigo") int id) {
		
		Pelicula pelicula_xid= new Pelicula();
		
		pelicula_xid= peliculaServiceImpl.peliculaXID(id);
		
		System.out.println("Pelicula XID: "+pelicula_xid);
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name="codigo")int id, @RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaServiceImpl.peliculaXID(id);
		
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionado);
		
		System.out.println("El Pelicula actualizado es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo")int id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}
}
