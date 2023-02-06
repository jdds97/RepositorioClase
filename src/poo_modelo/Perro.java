package poo_modelo;

import javax.swing.JOptionPane;

public class Perro {
	private String raza;
	private String nombre;
	private int edad;
	private boolean hambriento;
	private boolean cansado;
	public  Perro(String raza,String nombre,int edad,boolean hambriento,boolean cansado){
		this.setRaza(raza);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setRaza(raza);
		this.setHambriento(hambriento);
		this.setCansado(cansado);
		
	}
	public void cambiarCansado(boolean cansado) {
		if(cansado=true) {
			JOptionPane.showMessageDialog(null, "El perro está cansado");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "El perro está ready ");
		}
	}
	public boolean isCansado() {
		return cansado;
	}
	public void setCansado(boolean cansado) {
		this.cansado = cansado;
	}
	public boolean isHambriento() {
		return hambriento;
	}
	public void setHambriento(boolean hambriento) {
		this.hambriento = hambriento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

	
}
