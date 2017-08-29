package com.utn.vista;

import com.utn.controladores.Utilidades;
import com.utn.entidades.Boxeador;
import com.utn.entidades.Entrenador;

public class Main {

	public static void main(String[] argumentos) {

		// Creamos los entrenadores, calculamos y Setteamos sus categorias
		Entrenador entrenador1 = new Entrenador("Apollo", 100);
		Utilidades.calculoCategoriaEntrenador(entrenador1);

		Entrenador entrenador2 = new Entrenador("Flavio", 75);
		Utilidades.calculoCategoriaEntrenador(entrenador2);

		Entrenador entrenador3 = new Entrenador("Lorenzo", 60);
		Utilidades.calculoCategoriaEntrenador(entrenador3);

		Entrenador entrenador4 = new Entrenador("Arturo", 50);
		Utilidades.calculoCategoriaEntrenador(entrenador4);

		// Recuperamos los Arrays de la Clase Entrenadores y colocamos los que
		// creemos
		System.out.println("------------------------- Listado de entrenadores -------------------------");
		Entrenador.initialize();//Inicializamos los arrays llamando al método initialize
		Entrenador.agregarEntrenadores(entrenador1);
		Entrenador.agregarEntrenadores(entrenador2);
		Entrenador.agregarEntrenadores(entrenador3);
		Entrenador.agregarEntrenadores(entrenador4);
		System.out.println("");

		// Creamos a los boxeadores, calculamos y Setteamos sus categorias
		System.out.println("------------------------- Listado de boxeadores -------------------------");
		Boxeador boxeador1 = new Boxeador("Gatica", 100);
		Utilidades.calculoCategoriaBoxeador(boxeador1);

		Boxeador boxeador2 = new Boxeador("Moloko", 80);
		Utilidades.calculoCategoriaBoxeador(boxeador2);

		Boxeador boxeador3 = new Boxeador("Gargamel",50);
		Utilidades.calculoCategoriaBoxeador(boxeador3);

		Boxeador boxeador4 = new Boxeador("Shera", 75);
		Utilidades.calculoCategoriaBoxeador(boxeador4);

		Boxeador boxeador5 = new Boxeador("Tulio", 60);
		Utilidades.calculoCategoriaBoxeador(boxeador5);

		Boxeador boxeador6 = new Boxeador("Marcel", 91);
		Utilidades.calculoCategoriaBoxeador(boxeador6);

		Boxeador boxeador7 = new Boxeador("Denise", 77);
		Utilidades.calculoCategoriaBoxeador(boxeador7);

		Boxeador boxeador8 = new Boxeador("Charles", 70);
		Utilidades.calculoCategoriaBoxeador(boxeador8);
		
		Boxeador boxeador9 = new Boxeador("Veronica", 64);
		Utilidades.calculoCategoriaBoxeador(boxeador9);
		
		Boxeador boxeador10 = new Boxeador("Sanjiao", 60);
		Utilidades.calculoCategoriaBoxeador(boxeador10);

		entrenador1.agregarBoxeador(boxeador1, entrenador1);
		entrenador1.agregarBoxeador(boxeador2, entrenador1);
		entrenador1.agregarBoxeador(boxeador3, entrenador1);
		entrenador1.agregarBoxeador(boxeador4, entrenador1);
		entrenador1.agregarBoxeador(boxeador5, entrenador1);
		System.out.println("");
		
		entrenador2.agregarBoxeador(boxeador6, entrenador2);
		entrenador2.agregarBoxeador(boxeador7, entrenador2);
		entrenador2.agregarBoxeador(boxeador8, entrenador2);
		entrenador2.agregarBoxeador(boxeador9, entrenador2);
		entrenador2.agregarBoxeador(boxeador10, entrenador2);
		System.out.println("");
		
		System.out.println("------------------------- Reportes -------------------------");
		System.out.println("Entrenadores:");
		Entrenador.cantidadEntrenadores();
		System.out.println("");
		System.out.println("Boxeadores totales:");
		Entrenador.cantidadBoxeadores();
		System.out.println("");
		System.out.println("Boxeadores por categoría:");
		Utilidades.cantidadBoxeadoresPorCategoria();
		
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setBounds(100,100,650,700);
		v.setLocationRelativeTo(null);
	
		
	}

}
