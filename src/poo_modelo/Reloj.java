/**
 * 
 */
package poo_modelo;

import java.time.LocalDateTime;

/**
 * @author Jesús De Dios.R4
 *
 */
public  abstract class Reloj {
		private static LocalDateTime hora;
		private static boolean alarma=false;
		/**
		 * @param hora
		 */
		public abstract Reloj(LocalDateTime hora);
		public void alarma(LocalDateTime horaParada){
			hora=horaParada;
		}
}
