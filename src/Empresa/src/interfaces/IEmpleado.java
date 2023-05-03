package Empresa.src.interfaces;

import java.time.LocalDate;

/**
 * Interfaz utilizada para reprsentar a un empleado
 * 
 * @author Raul SG
 *
 */
public interface IEmpleado extends Comparable<IEmpleado> {

	//Crear para la clase un consructor sin parametros
	
	/**
	 * Metodo para obtener el nombre del empleado
	 */
	public String getNombre();
	
	
	/**
	 * Metodo para modificar el nombre del empleado
	 * 
	 * @param String. Nombre del empleado
	 */
	public void setNombre(String nombre);
	
	
	/**
	 * Metodo para obtener los apellidos del empleado
	 */
	public String getApellidos();
	
	
	/**
	 * Metodo para modificar el apellido del empleado
	 * 
	 * @param String. Apellido del empleado
	 */
	public void setApellido(String apellido);
	
	/**
	 * Metodo para obtener la fecha de nacimiento del empleado
	 */
	public LocalDate getFechaNacimiento();
	
	
	/**
	 * Metodo para modificar la fecha de nacimiento del empleado
	 * 
	 * @param fecha de nacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento);
	
	/**
	 * Metodo para obtener la edad del empleado
	 * 
	 * No tiene que existir un atributo edad. La edad se tiene que 
	 * calcular en base a la fecha de nacimiento y la fecha actual, ya
	 * que la edad ira cambiando.
	 * 
	 * NOTA: Siempre que haya un metodo get no significa que tenga que haber un atributo. 
	 * Se debe pensar si se puede calcular en base a otro atributos, o atributos
	 * existentes.
	 * 
	 * @return int. Numero de años que ha cumplido el empleado
	 */
	public int getEdad();
}
