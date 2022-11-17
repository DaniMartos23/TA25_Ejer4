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

import com.crud.h2.dto.Sala;
import com.crud.h2.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")

public class SalasController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	//listar salas por campo nombre
	@GetMapping("/salas/nombre/{nombre}")
	public List<Sala> listarSalaNombre(@PathVariable(name="nombre") String nombre) {
	    return salaServiceImpl.listarSalaNombre(nombre);
	}
	
	
	@PostMapping("/salas")
	public Sala salvarSala( @RequestBody Sala sala) {
		return salaServiceImpl.guardarSala(sala);
	}
	
	
	@GetMapping("/salas/{codigo}")
	public Sala SalaXID(@PathVariable(name="codigo") int id) {
		
		Sala sala_xid= new Sala();
		
		sala_xid= salaServiceImpl.salaXID(id);
		
		System.out.println("Sala XID: "+sala_xid);
		
		return sala_xid;
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name="codigo")int id, @RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServiceImpl.salaXID(id);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPeliculas(sala.getPeliculas());
		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("El Sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name="codigo")int id) {
		salaServiceImpl.eliminarSala(id);
	}
}
