package poo_modelo;

import javax.swing.JOptionPane;

public class PersonaCuenta {

	private String nombre;
	private String apellidos;
	private int edad;
	char sexo;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param sexo
	 */
	public PersonaCuenta(String nombre, String apellidos, int edad, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
	}

	/**
	 * 
	 */
	public PersonaCuenta() {
		this.nombre = "Jesus";
		this.apellidos = "de Dios Sánchez";
		this.edad = 25;
		this.sexo = 'M';
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

	public void saludar() {
		JOptionPane.showMessageDialog(null,"Hola me llamo"+this.nombre);
		
		
	}
	public void abrirCuenta(String iban, final double INTERES_MENSUAL, int numeroCuenta, double saldo) {
		new Cuenta(iban,INTERES_MENSUAL, numeroCuenta, saldo);
	}
}
