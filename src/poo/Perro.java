package poo;

import javax.swing.JOptionPane;

public class Perro {
	private String raza;
	private String nombre;
	private int edad;
	private boolean hambriento;
	private boolean cansado;
	public  Perro(String raza,String nombre,int edad,boolean hambriento,boolean cansado){
		this.raza=raza;
		this.nombre=nombre;
		this.edad=edad;
		this.raza=raza;
		this.hambriento=hambriento;
		this.cansado=cansado;
		
	}
	public void cambiarCansado(boolean cansado) {
		if(cansado=true) {
			JOptionPane.showMessageDialog(null, "El perro está cansado");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "El perro está ready ");
		}
	}

	
}
