/**
 * 
 */
package poo_modelo;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Piratagochi {
	public static String necesidad = "nada";
	private String nombre;
	private int energia;
	private boolean estaHambriento;
	private int nivelFelicidad;
	Random random = new Random();

	/**
	 * <h1 style=color:red;>Constructor</h1>
	 * <p>
	 * Constructor de un piratagochi sin parámetros.
	 * </p>
	 */
	public Piratagochi() {
		this.nombre = "Jesus";
		this.energia = random.nextInt() * 10 + 1;
		this.estaHambriento = random.nextBoolean();
		this.nivelFelicidad = random.nextInt() * 10 + 1;
	}

	/**
	 * <h1 style=color:red;>Constructor</h1>
	 * <p>
	 * Constructor de un piratagochi con el parámetro de nombre
	 * </p>
	 * 
	 * @param nombre
	 *
	 */
	public Piratagochi(String nombre) {
		this.nombre = nombre;
		this.energia = random.nextInt() * 10 + 1;
		this.estaHambriento = random.nextBoolean();
		this.nivelFelicidad = random.nextInt() * 10 + 1;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para elegir las opciones que hacer con un piratagochi
	 * </p>
	 */
	

	/**
	 * <h1 style=color:red;>Constructor</h1>
	 * <p>
	 * Constructor de un piratagochi con varios parámetros
	 * </p>
	 * 
	 * @param nombre
	 * @param energia
	 * @param estaHambriento
	 * @param nivelFelicidad
	 */
	public Piratagochi(String nombre, int energia, boolean estaHambriento, int nivelFelicidad) {

		this.nombre = nombre;
		this.energia = energia;
		this.estaHambriento = estaHambriento;
		this.nivelFelicidad = nivelFelicidad;
	}

	/**
	 * <h1 style=color:blue;>Acción</h1>
	 * <p>
	 * Método para que el piratagochi coma
	 * </p>
	 * 
	 */
	public void comer() {
		if (estaHambriento)
			estaHambriento = false;

		if (!estaHambriento)
			nivelFelicidad--;
		necesidad = "dormir";
	}

	/**
	 * <h1 style=color:blue;>Acción</h1>
	 * <p>
	 * Método para que el piratagochi duerma
	 * </p>
	 * 
	 * @param horasDurmiendo
	 */
	public void dormir(int horasDurmiendo) {
		for (int i = 0; i < horasDurmiendo; i++) {
			energia++;
			if (horasDurmiendo > 10 && horasDurmiendo < 24)
				nivelFelicidad--;
		}

		necesidad = "jugar";
	}

	/**
	 * <h1 style=color:blue;>Acción</h1>
	 * <p>
	 * Método para que el piratagochi juega
	 * </p>
	 * 
	 * @param horasJugando
	 */
	public void jugar(int horasJugando) {

		if (estaHambriento = false) {
			horasJugando = nivelFelicidad;
			energia -= horasJugando;
			estaHambriento = true;
		}
		if (estaHambriento = true) {
			nivelFelicidad -= horasJugando;
			energia -= horasJugando;
		}
		necesidad = "dormir";
	}

	/**
	 * <h1 style=color:blue;>Acción</h1>
	 * <p>
	 * Método para que ver las necesidades del piratagochi
	 * </p>
	 */

	public void getNecesidades() {
		JOptionPane.showMessageDialog(null, "¡" + nombre + " quiere " + necesidad + "!");

	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para modificar el nombre
	 * </p>
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para modificar el nombre
	 * </p>
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para mostrar la energía
	 * </p>
	 * 
	 * @return the energia
	 */
	public int getEnergia() {
		return energia;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para modificar la energía
	 * </p>
	 * 
	 * @param energia
	 */
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para mostrar el que esté hambriento
	 * </p>
	 * 
	 * @return estaHambriento
	 */
	public boolean isEstaHambriento() {
		return estaHambriento;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para modificar el que esté hambriento
	 * </p>
	 * 
	 * @param estaHambriento
	 */
	public void setEstaHambriento(boolean estaHambriento) {
		this.estaHambriento = estaHambriento;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para mostrar el nivel de felicidad/p>
	 * 
	 * @return nivelFelicidad
	 */
	public int getNivelFelicidad() {
		return nivelFelicidad;
	}

	/**
	 * <h1 style=color:blue>Acción</h1>
	 * <p>
	 * Método para modificar el nivel de felicidad/p>
	 * 
	 * @param nivelFelicidad
	 */
	public void setNivelFelicidad(int nivelFelicidad) {
		this.nivelFelicidad = nivelFelicidad;
	}
}
