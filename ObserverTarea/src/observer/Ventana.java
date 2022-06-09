package observer;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Ventana extends JFrame{
	
	private final JButton botonR = new JButton("Rojo");
	private final JButton botonAm = new JButton("Amarillo");
	private final JButton botonAz = new JButton("Azul");
	
	
	public Ventana() {
		setTitle("Tarea Colores");
		setSize(1000,1000);
		setLocation(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container Fondo= getContentPane();
		SpringLayout layout = new SpringLayout();
		Fondo.setLayout(layout);
		
		layout.putConstraint(SpringLayout.WEST, botonR, 100, SpringLayout.WEST, Fondo);
		layout.putConstraint(SpringLayout.NORTH, botonR, 200, SpringLayout.NORTH, Fondo);
		
		layout.putConstraint(SpringLayout.WEST, botonAm, 500, SpringLayout.WEST, Fondo);
		layout.putConstraint(SpringLayout.NORTH, botonAm, 200, SpringLayout.NORTH, Fondo);
		
		layout.putConstraint(SpringLayout.WEST, botonAz, 900, SpringLayout.WEST, Fondo);
		layout.putConstraint(SpringLayout.NORTH, botonAz, 200, SpringLayout.NORTH, Fondo);
		
		botonR.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent evento) {
				ChangeColor(Fondo, botonR.getText());				
			}			
		});
		
		botonAm.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent evento) {
				ChangeColor(Fondo, botonAm.getText());				
			}			
		});
		
		botonAz.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent evento) {
				ChangeColor(Fondo, botonAz.getText());				
			}			
		});
		
		Fondo.add(botonR);
		Fondo.add(botonAm);
		Fondo.add(botonAz);
		
	}
	
	public static void ChangeColor(Container c, String color) {
		switch(color){
		case "Rojo":
			c.setBackground(Color.RED);
			break;
		case "Amarillo":
			c.setBackground(Color.YELLOW);
			break;
		case "Azul":
			c.setBackground(Color.BLUE);
			break;
			
		}
		
	}
	

}
