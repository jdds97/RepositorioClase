package HollyWood.src.interfaces;

import java.time.LocalDate;

/**
 * Interfaz utilizada para reprsentar a un actor. De los actores
 * se desea gestionar las peliculas en las que ha participado
 * 
 * @author Raul SG
 *
 */
public interface IActor {

	//Crear para la clase un consructor sin parametros
	
	/**
	 * Metodo para obtener el nombre del actor
	 */
	public String getNombre();
	
	
	/**
	 * Metodo para modificar el nombre del actor
	 * 
	 * @param String. Nombre del actor
	 */
	public void setNombre(String nombre);
	
	
	/**
	 * Metodo para obtener los apellidos del actor
	 */
	public String getApellidos();
	
	
	/**
	 * Metodo para modificar el apellido del actor
	 * 
	 * @param String. Apellido del actor
	 */
	public void setApellido(String apellido);
	
	/**
	 * Metodo para obtener la fecha de nacimiento del actor
	 */
	public LocalDate getFechaNacimiento();
	
	
	/**
	 * Metodo para modificar la fecha de nacimiento del actor
	 * 
	 * @param fecha de nacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento);
	
	
	/**
	 * De cada actor se desea tener un registro de las peliculas en las
	 * que ha participado. Con el siguienet metodo se desea añadir al listado
	 * de peliculas del actor la pelicula pasada por parametro
	 * 
	 * @param IPelicula. 
	 */
	public void addPelicula(IPelicula pelicula);
	
	/**
	 * Metodo que devuelve el total de oscar que han ganado las peliculas en
	 * las que ha participado el actor.
	 * @return int. Siumatorio del numero de oscar de las peliculas del actor.
	 */
	public int getOscars();
}
