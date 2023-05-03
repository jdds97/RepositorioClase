package Empresa.src.interfaces;

import java.util.List;

/**
 * Interfaz utilizada para gestionar una oficina, y sus empleados
 *   
 * @author Raul SG
 *
 */
public interface IOficina {
	
	
	public List<IEmpleado> getEmpleados ();
	public void setEmpleados (List<IEmpleado> empleados);
	/**
	 * Este metodo agrega al empleado en cuestion al registro de empleados
	 * de la tienda
	 * 
	 * @param empleado que se agrega
	 */
	public void addEmpleado(IEmpleado empleado);
	
	/**
	 * Metodo utilizado para desvincular a un empleado del registro de una oficina
	 * 
	 * @param apellidos
	 * @param nombre
	 * @return devuelve true si existia y se ha borrado, y false en caso contrario
	 */
	public boolean despedirEmpleado(String apellidos, String nombre);
	
	/**
	 * Devuelve el empleado con mas edad de la oficina
	 * 
	 * @return IEmpleado con mayor edad
	 */
	public IEmpleado getEmpleadoMayorEdad();

}
