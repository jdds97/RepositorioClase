package Taller.interfaces;

/**
 * Interfaz que representa el comportamiento de un taller especializado en
 * motos.
 */
public interface ITallerMotos {

	/**
	 * Agregar una moto al registro de motos para atender en el taller 
	 * 
	 * @param moto. Moto que se agrega al registro de motos.
	 */
	public void entrarMoto(IMoto moto);
	
	/**
	 * Metodo que modifica el color de la moto que se encuentra en el registro 
	 * de motos del taller, cuyo matricula es la dada como parametro. El
	 * color nuevo de la moto sera el aportado como parametro.
	 * 
	 * @param matricula. Matricula que identifica a la moto a la que
	 * se le desea cambiar el color por el color aportado como parametro.
	 * 
	 * @param color. Nuevo color que se va a estabelecer en la moto con la
	 * matricula indicada
	 */
	public boolean pintarColor(String matricula, String color);
	
	
	/**
	 * Borra una moto al registro de motos para atender en el taller 
	 * 
	 * @param matricula. Matricula de la moto que se quiere borrar del registro de motos.
	 * 
	 */
	public void borrarMoto(String matricula);
	
	/**
	 * Metodo utilizado para instalar un sidecar en la moto con la matricula indicada
	 * en el parametro. Si tiene un Sidecar, la moto se queda igual.
	 * 
	 *  
	 * @param matricula. Matricula de la moto en la que se quiere instalar el sidecar.
	 */
	public void instalarSidecar(String matricula);
	
	
}
