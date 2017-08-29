package com.utn.entidades;

public class Entrenador extends Persona {

	String categoria;

		public Entrenador(String nombre, double peso) {
			super(nombre, peso);
		}

		public String getCategoria() {
			return categoria;
		}
	
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
}
