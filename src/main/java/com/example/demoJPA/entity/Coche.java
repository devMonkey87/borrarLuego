package com.example.demoJPA.entity;

public class Coche {

	private String matricula;

	private String fabricante;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Coche(String matricula, String fabricante) {
		super();
		this.matricula = matricula;
		this.fabricante = fabricante;
	}

	public Coche() {
		super();
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", fabricante=" + fabricante + "]";
	}

}
