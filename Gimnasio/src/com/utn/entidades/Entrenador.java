package com.utn.entidades;

public class Entrenador extends Persona {

	String categoria;
	static int indiceBoxeador = 0;
	static int indiceEntrenador = 0;
	int indiceBoxeadorParcial = 0;
	static Boxeador[] boxeadores;
	static Entrenador[] entrenadores;

		public Entrenador(String nombre, double peso) {
			super(nombre, peso);
		}
	
		public static void initialize() {
			boxeadores = new Boxeador[20];
			entrenadores = new Entrenador[4];
		}
	
		public String getCategoria() {
			return categoria;
		}
	
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
}
