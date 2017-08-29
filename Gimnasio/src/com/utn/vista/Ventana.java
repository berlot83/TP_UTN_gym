package com.utn.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import com.utn.controladores.Utilidades;
import com.utn.entidades.Boxeador;
import com.utn.entidades.Entrenador;

public class Ventana extends JFrame implements ActionListener {
	Boxeador[] boxeadores = new Boxeador[20];
	Entrenador[] entrenadores = new Entrenador[4];
	int indiceBoxeador = 0;
	int indiceEntrenador = 0;

	public JPanel panelArriba, panelMedio, panelAbajo, panelInterno1, panelInterno2;
	public ImageIcon banner, iconoMas, iconoVer, iconoLimpiar, iconoSalir, iconoRegistro, iconoAsignarEntrenadores;
	public JButton agregarEntrenador, agregarBoxeador, verEntrenadores, verBoxeadores, asignarEntrenadores, detalles, clear, salir;
	public JLabel labelImage, nombreEntrenador, pesoEntrenador, nombreBoxeador, pesoBoxeador;
	public JTextField textNombreEntrenador, textPesoEntrenador, textNombreBoxeador, textPesoBoxeador;
	public JTextArea areaIngreso;
	public JScrollPane scroll;

	public Ventana() {
		this.setLayout(new BorderLayout());
		panelArriba = new JPanel();
		panelMedio = new JPanel();
		panelAbajo = new JPanel();
		panelInterno1 = new JPanel();
		panelInterno2 = new JPanel();
		banner = new ImageIcon("../Gimnasio/src/com/utn/imagenes/bannergym.png");
		iconoMas = new ImageIcon("../Gimnasio/src/com/utn/imagenes/mas.png");
		iconoVer = new ImageIcon("../Gimnasio/src/com/utn/imagenes/ver.png");
		iconoAsignarEntrenadores = new ImageIcon("../Gimnasio/src/com/utn/imagenes/boxeo.png");
		iconoLimpiar = new ImageIcon("../Gimnasio/src/com/utn/imagenes/limpiar.png");
		iconoRegistro = new ImageIcon("../Gimnasio/src/com/utn/imagenes/registro.png");
		iconoSalir = new ImageIcon("../Gimnasio/src/com/utn/imagenes/salir.png");
		labelImage = new JLabel(banner);
		nombreEntrenador = new JLabel("Nombre del Entrenador");
		pesoEntrenador = new JLabel("Peso del Entrenador");
		nombreBoxeador = new JLabel("Nombre del Boxeador");
		pesoBoxeador = new JLabel("Peso del Boxeador");
		agregarEntrenador = new JButton("Entrenador", iconoMas);
		agregarBoxeador = new JButton("Boxeador", iconoMas);
		verEntrenadores = new JButton("Entrenadores disponibles", iconoVer);
		verBoxeadores = new JButton("Boxeadores disponibles", iconoVer);
		asignarEntrenadores = new JButton("Asignar Ent.", iconoAsignarEntrenadores);
		clear = new JButton("Limpiar", iconoLimpiar);
		detalles = new JButton("Detalles", iconoRegistro);
		salir = new JButton("Salir", iconoSalir);
		textNombreEntrenador = new JTextField(10);
		textPesoEntrenador = new JTextField(3);
		textNombreBoxeador = new JTextField(10);
		textPesoBoxeador = new JTextField(3);
		areaIngreso = new JTextArea(10, 55);
		areaIngreso.setBackground(Color.darkGray);
		areaIngreso.setForeground(Color.green);
		scroll = new JScrollPane(areaIngreso);
		areaIngreso.setEditable(false);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		this.setTitle("Administrador de Gimnasios");
		this.add(panelArriba, BorderLayout.NORTH);
		this.add(panelMedio, BorderLayout.CENTER);
		this.add(panelAbajo, BorderLayout.SOUTH);

		// Panel Arriba
		panelArriba.add(labelImage);

		// Panel Medio
		panelMedio.add(panelInterno1);
		panelInterno1.setLayout(new GridLayout(3, 3, 3, 3));
		panelInterno1.add(nombreEntrenador);
		panelInterno1.add(textNombreEntrenador);
		panelInterno1.add(pesoEntrenador);
		panelInterno1.add(textPesoEntrenador);

		panelMedio.add(panelInterno2);
		panelInterno2.setLayout(new GridLayout(3, 3, 3, 3));
		panelInterno2.add(nombreBoxeador);
		panelInterno2.add(textNombreBoxeador);
		panelInterno2.add(pesoBoxeador);
		panelInterno2.add(textPesoBoxeador);
		panelMedio.add(scroll);

		// Panel Abajo
		panelAbajo.setLayout(new GridLayout(2, 2, 2, 2));
		panelAbajo.add(agregarEntrenador);
		panelAbajo.add(agregarBoxeador);
		panelAbajo.add(verEntrenadores);
		panelAbajo.add(verBoxeadores);
		panelAbajo.add(asignarEntrenadores);
		panelAbajo.add(clear);
		panelAbajo.add(detalles);
		panelAbajo.add(salir);

		this.agregarEntrenador.addActionListener(this);
		this.agregarBoxeador.addActionListener(this);
		this.verEntrenadores.addActionListener(this);
		this.verBoxeadores.addActionListener(this);
		this.asignarEntrenadores.addActionListener(this);
		this.clear.addActionListener(this);
		this.detalles.addActionListener(this);
		this.salir.addActionListener(this);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Entrenador entrenador1;
		
		Object obj = e.getSource();
		if (obj.equals(agregarEntrenador)) {
			areaIngreso.setText("");
			if (indiceEntrenador < 4) {
				areaIngreso.setForeground(Color.green);
				Entrenador entrenador1 = new Entrenador(textNombreEntrenador.getText(),
						Integer.parseInt(textPesoEntrenador.getText()));
				entrenadores[indiceEntrenador] = entrenador1;
				indiceEntrenador++;

				Utilidades.calculoCategoriaEntrenador(entrenador1);
				areaIngreso.append(
						"ID: " + indiceEntrenador + "   Entrenador: " + entrenadores[indiceEntrenador - 1].getNombre()
								+ "   Categorías: " + entrenadores[indiceEntrenador - 1].getCategoria() + "\n");
			} else {
				areaIngreso.setText("");
				areaIngreso.setForeground(Color.red);
				areaIngreso.append("Ya no se puede agregar más entrenadores \n");
			}
		}

		Object obj2 = e.getSource();
		if (obj2.equals(agregarBoxeador) && indiceBoxeador < 21) {
			areaIngreso.setText("");
			areaIngreso.setForeground(Color.green);
			Boxeador boxeador1 = new Boxeador(textNombreBoxeador.getText(),
					Integer.parseInt(textPesoBoxeador.getText()));
			boxeadores[indiceBoxeador] = boxeador1;
			indiceBoxeador++;
			if (boxeador1 != null && indiceBoxeador < 21) {
				Utilidades.calculoCategoriaBoxeador(boxeador1);
				areaIngreso
						.append("ID: " + indiceBoxeador + "   Boxeador: " + boxeadores[indiceBoxeador - 1].getNombre()
								+ "   Peso: " + boxeadores[indiceBoxeador - 1].getPeso() + "  Categoria: "
								+ boxeadores[indiceBoxeador - 1].getCategoria() + "\n");
			} else {
				areaIngreso.setText("");
				areaIngreso.setForeground(Color.red);
				areaIngreso.append("Superó el límite de boxeadores\n");
			}
		}
	
//Pruebas 1, Este código pretende asignar a cada boxeador un entrenador, no funciona bien
		Object asignarEntrenador = e.getSource();
		if (asignarEntrenador.equals(asignarEntrenadores)) {
		areaIngreso.setText("");
		int contadorEntrenadores = 0;
		for(int j = 0; j < entrenadores.length; j++){
			for (int i = 0; i <= boxeadores.length; i++) {
				if(boxeadores[i].getPeso() > 91){
					while (entrenadores[j].getPeso() > 91) {
					boxeadores[i].setEntrenadorAsignado(entrenadores[j].getNombre());
					areaIngreso.append("Al boxeador "+boxeadores[i].getNombre()+" se le ha asignado el siguiente entrenador: "+boxeadores[i].getEntrenadorAsignado()+ "\n");
					break;
					}
				}
				if(boxeadores[i].getPeso() <= 91 && boxeadores[i].getPeso() > 76){
					while (entrenadores[j].getPeso() <= 91 && entrenadores[j].getPeso() > 76){
					boxeadores[i].setEntrenadorAsignado(entrenadores[j].getNombre());
					areaIngreso.append("Al boxeador "+boxeadores[i].getNombre()+" se le ha asignado el siguiente entrenador: "+boxeadores[i].getEntrenadorAsignado()+ "\n");
					break;
					}
				}
			}
			}
		}

		Object accionEntrenadores = e.getSource();
		if (accionEntrenadores.equals(verEntrenadores)) {
			areaIngreso.setText("");
			areaIngreso.setForeground(Color.green);
			for (int i = 0; i < entrenadores.length; i++) {
				areaIngreso.append("Entrenador: " + entrenadores[i].getNombre() + "  Peso: " + entrenadores[i].getPeso()
						+ "  Categorías: " + entrenadores[i].getCategoria() + "\n");
			}
		}

		Object accionBoxeadores = e.getSource();
		if (accionBoxeadores.equals(verBoxeadores)) {
			areaIngreso.setText("");
			areaIngreso.setForeground(Color.green);
			for (int i = 0; i < boxeadores.length; i++) {
				areaIngreso.append("Boxeador: " + boxeadores[i].getNombre() + "  Peso: " + boxeadores[i].getPeso()
						+ "  Categoría: " + boxeadores[i].getCategoria() + "\n");
			}
		}

		Object accionLimpiar = e.getSource();
		if (accionLimpiar.equals(clear)) {
			areaIngreso.setText("");
		}

		Object objetoDetalles = e.getSource();
		if (objetoDetalles.equals(detalles)) {
			VentanaResultado v = new VentanaResultado();
			v.setBounds(100, 100, 250, 380);
			v.setVisible(true);
			v.setLocationRelativeTo(null);
			v.areaIngreso.setFont(areaIngreso.getFont().deriveFont(16f));
			v.areaIngreso.append("--------- Alumnos por categorías ---------\n");
			v.areaIngreso.append("Pesados: "+Utilidades.cantidadBoxeadoresPesados()+ "\n");
			v.areaIngreso.append("Medios pesados: "+Utilidades.cantidadBoxeadoresMediosPesados()+ "\n");
			v.areaIngreso.append("Medianos: "+Utilidades.cantidadBoxeadoresMedianos()+ "\n");
			v.areaIngreso.append("Welters: "+Utilidades.cantidadBoxeadoresWelters()+ "\n");
			v.areaIngreso.append("Ligeros: "+Utilidades.cantidadBoxeadoresLigeros()+ "\n");
			v.areaIngreso.append("Gallos: "+Utilidades.cantidadBoxeadoresGallo()+ "\n");
			v.areaIngreso.append("Plumas: "+Utilidades.cantidadBoxeadoresPlumas()+ "\n");
			v.areaIngreso.append("Moscas: "+Utilidades.cantidadBoxeadoresMosca()+ "\n");
			v.areaIngreso.append("\n");
			v.areaIngreso.append("------------------- Totales -------------------\n");
			v.areaIngreso.append("Total Entrenadores: " + indiceEntrenador + "\n");
			v.areaIngreso.append("Total Boxeadores: " + indiceBoxeador + "\n");
			int totalPersonas = indiceEntrenador + indiceBoxeador;
			v.areaIngreso.append("Total de socios: " + totalPersonas + "\n");
		}

		Object exit = e.getSource();
		if (exit.equals(salir)) {
			System.exit(0);
		}
	}
}
