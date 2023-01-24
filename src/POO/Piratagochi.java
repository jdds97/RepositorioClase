/**
 * 
 */
package POO;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Piratagochi {
	private String nombre;
	/**
	 * @param nombre
	 */
	private int energia;// Siempre será un valor entre 1 y 10
	private boolean estaHambriento;
	private int nivelFelicidad;// Siempre será un valor entre 1 y 10
	/**
	 * 
	 */
	public Piratagochi() {
		this.nombre = "Jesus";
		this.energia =5 ;
		this.estaHambriento = true;
		this.nivelFelicidad = 5;
	}
	public Piratagochi(String nombre) {
		this.nombre = nombre;
		this.nombre = "Jesus";
		this.energia =5 ;
		this.estaHambriento = true;
		this.nivelFelicidad = 5;
	}
	/**
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
	public void comer() {
		this.estaHambriento=estaHambriento;
		this.nivelFelicidad=nivelFelicidad;
		if(estaHambriento=true) {
			estaHambriento=false;
		}
		if(estaHambriento=false) 
		nivelFelicidad--;
		}
	public void dormir(int horasDurmiendo) {
		this.energia=energia;
		this.nivelFelicidad=nivelFelicidad;
		for (int i = 0; i < horasDurmiendo; i++) {
			energia++;
			if (horasDurmiendo>10 && horasDurmiendo<24)
			nivelFelicidad--;
		}
		
	}
	public void jugar(int horasJugando) {
		this.nivelFelicidad=nivelFelicidad;
		if (estaHambriento=false && horasJugando<=10) {
			horasJugando=nivelFelicidad;
			energia-=horasJugando;
			estaHambriento=true;
		}
		if(estaHambriento=true) {
			nivelFelicidad-=horasJugando;
			energia-=horasJugando;
		}
	public String getNecesidades() {
		JOptionPane.showMessageDialog(null, "¡Lucas quiere "+);
		return ();
	}
	
}
