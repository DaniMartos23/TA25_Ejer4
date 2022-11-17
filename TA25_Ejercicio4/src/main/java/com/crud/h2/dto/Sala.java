package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="salas")//en caso que la tabala sea diferente
public class Sala {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@ManyToOne()
    @JoinColumn(name = "pelicula")
    Pelicula peliculas;
	
	public Sala() {
		
	}
	
	
	
	public Sala(int codigo, String nombre, Pelicula peliculas) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.peliculas = peliculas;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pelicula getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Pelicula peliculas) {
		this.peliculas = peliculas;
	}



	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", peliculas="+ peliculas + "]";
	}

	
	
}
