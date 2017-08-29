package com.utn.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaResultado extends JFrame implements ActionListener {

	public JPanel panel;
	public JTextArea areaIngreso;
	public JButton volver;

	public VentanaResultado() {
		this.setTitle("Detalles de los socios del GYM");
		this.setLayout(new BorderLayout());
		panel = new JPanel();
		this.add(panel);
		areaIngreso = new JTextArea(3,10);
		areaIngreso.setForeground(Color.GREEN);
		areaIngreso.setBackground(Color.darkGray);
		volver = new JButton("Volver");
		panel.setLayout(new BorderLayout());
		panel.add(areaIngreso, BorderLayout.NORTH);
		panel.add(volver, BorderLayout.SOUTH);
		
		this.volver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object salir = e.getSource();
		if(salir.equals(volver)){
			this.dispose();
		}
	}

}
