package poo_modelo;

import java.time.LocalDate;

public class SuperHeroe extends Persona {
	private String poder;
	
	/**
	 * 
	 */
	
	public SuperHeroe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param sexo
	 */
	public SuperHeroe(String nombre, String apellidos, LocalDate fechaNacimiento, char sexo) {
		super(nombre, apellidos, fechaNacimiento, sexo);
	
	}

	/**
	 * @return the poder
	 */
	public String isPoder() {
		return poder;
	}

	/**
	 * @param poder the poder to set
	 */
	public void setPoder(String poder) {
		this.poder = poder;
	}

	/**
	 * @return the poder
	 */
	public String getPoder() {
		return poder;
	}
	
}
