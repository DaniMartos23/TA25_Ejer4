package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalasDAO;
import com.crud.h2.dto.Sala;


@Service
public class SalaServiceImpl implements ISalaService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Sala> listarSalas() {
		// TODO Auto-generated method stub
		return iSalasDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public List<Sala> listarSalaNombre(String nombre) {
		// TODO Auto-generated method stub
		return iSalasDAO.findByNombre(nombre);
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public void eliminarSala(int id) {
		
		iSalasDAO.deleteById(id);
		
	}
	
	

}
