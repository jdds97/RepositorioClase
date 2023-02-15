/**
 * 
 */
package poo_modelo;

import java.time.LocalTime;

/**
 * @author Jesús De Dios.R4
 *
 */
public abstract class Reloj {
	protected LocalTime hora = LocalTime.now();
	protected LocalTime horaAlarma;
	protected boolean alarma = false;

	/**
	 * @param hora
	 */

	abstract String mostrarHora();

	/**
	 * 
	 * @return El estado de la alarma
	 */
	public boolean isAlarma() {
		return alarma;
	}

	public boolean activarAlarma(int horas, int minutos) {
		alarma = true;

		horaAlarma = LocalTime.of(horas, minutos);

		return alarma;
	}

	/**
	 * @return the horaAlarma
	 */
	public LocalTime getHoraAlarma() {
		return horaAlarma;
	}

	/**
	 * 
	 * @return Desactiva la alarma
	 */
	public boolean desactivarAlarma() {
		if (alarma) {
			alarma = false;
		}
		return alarma;
	}
}
