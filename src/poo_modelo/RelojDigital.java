/**
 * 
 */
package poo_modelo;

import java.time.format.DateTimeFormatter;

/**
 * @author Jesus de Dios.R4
 *
 */

public class RelojDigital extends Reloj { 
	//Creacion de objeto DateTimeFormater para formatear el tiempo en horas y minutos.
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
	//Metodo sobreescrito
	@Override
	 public String mostrarHora() {
		 if(alarma==true && horaAlarma==hora )
		return "RING,RING,RING";
		return "Son las "+hora.format(formato);
		
	}
	

	


	
}
