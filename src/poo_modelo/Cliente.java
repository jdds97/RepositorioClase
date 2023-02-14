package poo_modelo;

import java.text.SimpleDateFormat;

public class Cliente extends PersonaVideoclub {
	private int idCliente;
	private int numeroAlquileres;
	protected SimpleDateFormat fechaAlquiler;

	
	
	/**
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(String nombre, int edad, String direccion, String telefono) {
		super(nombre, edad, direccion, telefono);
		// TODO Auto-generated constructor stub
	}
	public int getIdCliente() {
		return idCliente;
	}



	public int getNumeroAlquileres() {
		return numeroAlquileres;
	}

	public void setNumeroAlquileres(int numeroAlquileres) {
		this.numeroAlquileres = numeroAlquileres;
	}
}
