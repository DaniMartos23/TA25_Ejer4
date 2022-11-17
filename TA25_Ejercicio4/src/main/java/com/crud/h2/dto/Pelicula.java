package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="peliculas")//en caso que la tabala sea diferente
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde codigo final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "calificacionedad")
	private int calificacionedad;

	@OneToMany
    @JoinColumn(name="pelicula")
    private List<Sala> salas;
	
	public Pelicula() {
		
	}
	
	public Pelicula(int codigo, String nombre,int calificacionedad,List<Sala> salas) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionedad=calificacionedad;
		this.salas= salas;
	}

	/**
	 * @return codigo
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public int getCalificacionedad() {
		return calificacionedad;
	}

	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	/**
	 * 
	 * @return articulos
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salas")
	public List<Sala> getSalas() {
		return salas;
	}
	
	/**
	 * 
	 * @param salas
	 */
	
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", salas=" + salas + "]";
	}
	
	
	
}
