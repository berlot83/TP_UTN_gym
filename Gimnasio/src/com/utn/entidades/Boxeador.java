package com.utn.entidades;

public class Boxeador extends Persona{

	String categoria;
	
	public Boxeador(String nombre, double peso){
		super(nombre, peso);
	}


	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
