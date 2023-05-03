package interfaces;
import java.util.List;
/**
 * 
 * @author Raul SG
 * Interfaz que describe el comportamiento de un producto generico de la tienda
 * 
 *
 */
public interface IProducto extends Comparable <IProducto> {
	
	/**
	 * Metodo utilizado para saber el nombre del producto
	 * @return String con el nombre del producto
	 */
	public String getNombre();
	
	/**
	 * Metodo utilizado para modificar el nombre del producto
	 * @param nombre, String que se guardara como el nuevo nombre
	 * del producto
	 */
	public void setNombre(String nombre);
	
	/**
	 * Metodo utilizado para obtener el precio del producto
	 *  @return double, devuelve el precio del producto, el cual
	 *  es un numero con decimales.
	 */
	public double getPrecio();
	
	/**
	 * Metodo utilizado para modificar el precio del producto
	 * 
	 * @param precio, double que representa el nuevo precio del 
	 * producto. El metodo 
	 * setPrecio, no controla si el precio introducido es negativo.
	 */
	public void setPrecio(double precio);
	
	public List<IValoracion> getValoraciones();
	
	public void setValoraciones(List<IValoracion> valoraciones);
	/**
	 * Los productos tendran almacenados una lista de sus valoraciones. Este
	 * Metodo es utilizado para a�adir una valoracion al producto
	 * 
	 * @param valoracion, valoracion asociada al producto que se quiiere a�adir.
	 * 
	 */
	
	public void addValoracion(IValoracion valoracion);
	
	
	/**
	 * El siguiente metodo devuelve la valoracion media del producto. Para ello
	 * tiene en cuenta todas las valoraciones que se han asociado al producto
	 * con el metodo addValoracion, y calcula la puntuacion media de dichas valoraciones.
	 * Si un productio no tiene ninguna valoracion asociada, su puntuacion media es cero.
	 *  
	 * @return double, puntuacion media de las valoraciones asociadas al producto. Se
	 * calcula con decimales el resultado.
	 */
	public double getValoracionMedia();
	
	
	/**
	 * Metodo que devuelve todas las valoraciones realziadas por el usuario dado como parametro
	 * a los productos de la tienda
	 * @param usuario, Usuario por el que se desea filtrar.
	 * @return Devuleve una lista de valoraciones las cuales han sido a�adidas a
	 * productos de la tienda por el usuario pasado como parametro (por el que se desea filtrar)
	 */
	public List<IValoracion> getValoracionPorUsuario(IUsuario usuario);
	
	@Override
	public abstract int compareTo(IProducto p);
}
