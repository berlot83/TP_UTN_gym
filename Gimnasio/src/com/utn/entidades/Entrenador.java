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

	public void agregarBoxeador(Boxeador boxeador, Entrenador entrenador) {
		if (boxeador != null && indiceBoxeador <= 20) {
			boxeadores[indiceBoxeador] = boxeador;
			indiceBoxeador++;
			System.out.println("El entrenador " + entrenador.getNombre() + " tiene asignado el siguiente boxeador: "
					+ boxeador.getNombre() + ", su número es el siguiente: " + indiceBoxeador);
		} else {
			System.out.println("Se ha excedido la cantidad de boxeadores por entrenador");
		}
	}

	public static void agregarEntrenadores(Entrenador entrenador) {
		if (indiceEntrenador <= 3) {
			entrenadores[indiceEntrenador] = entrenador;
			indiceEntrenador++;
			System.out.println(
					"El entrenador número " + indiceEntrenador + " es " + entrenadores[indiceEntrenador - 1].getNombre()
							+ " y sus categorías son " + entrenadores[indiceEntrenador - 1].getCategoria());
		} else {
			System.out.println("La cantidad de entrenadores ha sido excedida");
		}
	}

	public static void cantidadEntrenadores() {
		System.out.println("La cantidad total de entrenadores es de " + indiceEntrenador);
	}

	public static void cantidadBoxeadores() {
		System.out.println("La cantidad total de boxeadores es de " + indiceBoxeador);
	}
}
