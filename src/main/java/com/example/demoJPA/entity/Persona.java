package com.example.demoJPA.entity;

public class Persona {

	private String dni;

	private String nombre;

	private String Categoria;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setcategoria(String Categoria) {
		this.Categoria = Categoria;
	}

	public Persona(String dni, String nombre, String Categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.Categoria = Categoria;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", Categoria=" + Categoria + "]";
	}

}
