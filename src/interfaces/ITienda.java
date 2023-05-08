package interfaces;


import java.util.List;

/**
 * 
 * @author Raul SG
 * 
 * Interfaz que describe el comportamiento de una tienda. Cada tienda tendra su 
 * propio catalogo de productos.
 *
 */
public interface ITienda extends Comparable<ITienda> {
	public List<IProducto> getProductos();
	public void setProductos(List<IProducto> productos);
	/**
	 * Metodo utilizado para a�adir un producto al catalogo de la tienda
	 * 
	 * @param producto, es el articulo que se quierea a�adir al catalogo de la
	 * tienda. Se permite que haya productos que se llamen igual repetidos.
	 */
	public void addProducto(IProducto producto);
	
	/**
	 * Metodo que devuelve la lista de productos del catalogo de la tienda
	 * ordenados por su precio, desde el mas barato al mas caro.
	 * 
	 * @return List<IProducto>, lista de los productos que tiene la tienda,
	 * ordenada por el precio de los articulos, en orden creciente, es decir, empezando
	 * por el producto con el precio mas bajo.
	 */
	public List<IProducto> getProductosOrdenadosPorPrecio();
	
	/**
	 * Del conjunto de productos del catalogo de la tienda, devuelve
	 * el producto cuya valoracion media es la mas alta. Si no hay ningun producto, devuelve null
	 * 
	 * 
	 * @return Producto con la valoracion cuya puntuacion  es la mas alta de todos los que se han a�adido
	 * a la tienda.
	 */
	public IProducto getProductoMejorValoracion();
	
}
