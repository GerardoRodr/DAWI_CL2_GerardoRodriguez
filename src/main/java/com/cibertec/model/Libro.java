package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	@Column(name = "idlibro")
	private int idlibro;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "cant_ejemplares")
	private int cant_ejemplares;
	
	@Column(name = "origen")
	private String origen;
	
	@Column(name = "idtema")
	private int idtema;

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCant_ejemplares() {
		return cant_ejemplares;
	}

	public void setCant_ejemplares(int cant_ejemplares) {
		this.cant_ejemplares = cant_ejemplares;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}
}
