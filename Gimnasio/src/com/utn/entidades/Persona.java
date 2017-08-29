package com.utn.entidades;

public abstract class Persona {
	
	String nombre;
	double peso;
	
	public Persona(String nombre, double peso){
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
