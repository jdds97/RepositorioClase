package poo_modelo;

import java.text.SimpleDateFormat;

public class Cliente {
	private int idCliente;
	private int numeroAlquileres;
	protected SimpleDateFormat fechaAlquiler;

	public Cliente(String nombre, int edad, String direccion, String telefono, int idCliente) {
		this.idCliente = idCliente;
		this.numeroAlquileres = 0;
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
