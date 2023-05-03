package HollyWood.src.interfaces;

/**
 * Interfaz utilizada para reprsentar una pelicula
 * 
 * @author Raul SG
 *
 */
public interface IPelicula extends Comparable<IPelicula> {
	
	/**
	 * Metodo para obtener el nombre de la pelicula
	 */
	public String getNombre();
	
	
	/**
	 * Metodo para modificar el nombre de la pelicula
	 * 
	 * @param String. Nombre de la pelicula
	 */
	public void setNombre(String nombre);
	
	/**
	 * Metodo para obtener el numero de Oscar que ha ganado la pelicula
	 */
	public int getNumeroOscars();
	
	
	/**
	 * Metodo para modificar el numero de Oscar de la pelicula
	 * 
	 * @param String. Nombre de la pelicula
	 */
	public void setNumeroOscars(int numeroOscar);
	
	

}
