package com.utn.controladores;

import com.utn.entidades.Boxeador;
import com.utn.entidades.Entrenador;

public class Utilidades {
	static int indicePesados = 0;
	static int indiceMedioPesados = 0;
	static int indiceMedianos = 0;
	static int indiceWelters = 0;
	static int indiceLigero = 0;
	static int indicePluma = 0;
	static int indiceGallo = 0;
	static int indiceMosca = 0;

	public static void calculoCategoriaEntrenador(Entrenador entrenador) {
		if (entrenador.getPeso() > 76.205) {
			entrenador.setCategoria("MedioPesado-Pesado");
		} else if (entrenador.getPeso() <= 76.205 && entrenador.getPeso() > 63.503) {
			entrenador.setCategoria("Welter-Mediano");
		} else if (entrenador.getPeso() <= 63.503 && entrenador.getPeso() > 55.338) {
			entrenador.setCategoria("Pluma-Ligero");
		} else if (entrenador.getPeso() <= 55.338 && entrenador.getPeso() > 48.988) {
			entrenador.setCategoria("Mosca-Gallo");
		} else if (entrenador.getPeso() <= 48.988) {
			entrenador.setCategoria("Sin Categoría regular con Dieta");
		}
	}

	public static void calculoCategoriaBoxeador(Boxeador boxeador) {
		if (boxeador.getPeso() > 91) {
			boxeador.setCategoria("Pesados");
			indicePesados++;
		} else if (boxeador.getPeso() <= 91 && boxeador.getPeso() > 79.378) {
			boxeador.setCategoria("MedioPesados");
			indiceMedioPesados++;
		} else if (boxeador.getPeso() <= 79.378 && boxeador.getPeso() > 76.205) {
			boxeador.setCategoria("Medianos");
			indiceMedianos++;
		} else if (boxeador.getPeso() <= 72.562 && boxeador.getPeso() > 69.853) {
			boxeador.setCategoria("Welter");
			indiceWelters++;
		} else if (boxeador.getPeso() <= 66.678 && boxeador.getPeso() > 63.503) {
			boxeador.setCategoria("Ligeros");
			indiceLigero++;
		} else if (boxeador.getPeso() <= 61.237 && boxeador.getPeso() > 58.967) {
			boxeador.setCategoria("Pluma");
			indicePluma++;
		} else if (boxeador.getPeso() <= 57.152 && boxeador.getPeso() > 55.338) {
			boxeador.setCategoria("Gallo");
			indiceGallo++;
		} else if (boxeador.getPeso() <= 55.338 && boxeador.getPeso() > 48.988) {
			boxeador.setCategoria("Mosca");
			indiceMosca++;
		}
		else if (boxeador.getPeso() <= 48.988) {
			boxeador.setCategoria("Necesita realizar una dieta, está debajo de su peso");
		}
	}
	
	public static void cantidadBoxeadoresPorCategoria(){
		System.out.println("Pesados: "+indicePesados);
		System.out.println("Medios pesados: "+indiceMedioPesados);
		System.out.println("Medianos: "+indiceMedianos);
		System.out.println("Welters: "+indiceWelters);
		System.out.println("Ligeros: "+indiceLigero);
		System.out.println("Plumas: "+indicePluma);
		System.out.println("Gallos: "+indiceGallo);
		System.out.println("Moscas: "+indiceMosca);
	}

}
