package com.utn.entidades;

public class Boxeador extends Persona{

	String categoria;
	String entrenadorAsignado;
	
	public Boxeador(String nombre, double peso){
		super(nombre, peso);
	}


	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getEntrenadorAsignado() {
		return entrenadorAsignado;
	}


	public void setEntrenadorAsignado(String entrenadorAsignado) {
		this.entrenadorAsignado = entrenadorAsignado;
	}
	
}
