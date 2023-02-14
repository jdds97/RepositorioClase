/**
 * 
 */
package poo_modelo;

import java.time.format.DateTimeFormatter;

/**
 * @author Jesús De Dios.R4
 *
 */

public class RelojDigital extends Reloj{
	 DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:MM");
	@Override
	public String mostrarHora() {
		return "Son las "+hora;
	}

	


	
}
