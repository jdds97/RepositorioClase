package POO;

import javax.swing.JOptionPane;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private double altura;
	private int dni;
	
	public String toString() {
		String resultado= "Hola me llamo"+this.nombre;
		return resultado;
		
	}
}
