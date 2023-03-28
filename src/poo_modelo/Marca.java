package poo_modelo;

import java.util.Random;

import RepasoExamenModelo.Bebida;

public class Marca {
	static Random string=new Random();
	private static String[] nombresMarcas = { "Coca Cola", "Fanta", "Seven Up", "Bitter Kas", "Pepsi" };
	private static int indiceAleatorioNombres = string.nextInt(nombresMarcas.length);
	private static String opcionSeleccionada = nombresMarcas[indiceAleatorioNombres];
	private Bebida bebida;
	public Marca(Bebida bebida) {
		this.bebida=bebida;
		
	}
	/**
	 * @return the opcionSeleccionada
	 */
	public static String getOpcionSeleccionada() {
		return opcionSeleccionada;
	}
	/**
	 * @return the bebida
	 */
	public Bebida getMarcaBebida() {
		return bebida;
	}
	
}