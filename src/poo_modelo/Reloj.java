/**
 * 
 */
package poo_modelo;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 * @author Jesús De Dios.R4
 *
 */
public abstract class Reloj {
	protected static LocalTime hora=LocalTime.now();
	private static LocalTime horaAlarma;
	private static boolean alarma = false;
	

	/**
	 * @param hora
	 */
	public LocalTime getHora() {
		return hora;
	};
	abstract String mostrarHora();


	public static boolean isAlarma() {
		return alarma;
	}

	public static void activarAlarma(LocalTime horaFijada) {
		if (hora == horaFijada) {
			JOptionPane.showMessageDialog(null, "RING RING RING");
		}

	}

	/**
	 * @return the horaAlarma
	 */
	public static LocalTime getHoraAlarma() {
		return horaAlarma;
	}

	/**
	 * @param horaAlarma the horaAlarma to set
	 */
	public static void setHoraAlarma(LocalTime horaAlarma) {
		Reloj.horaAlarma = horaAlarma;
	}

	/**
	 * 
	 * @return alarma desactivada
	 */
	public static boolean desactivarAlarma() {
		return alarma = false;
	}
}
