package colecciones;


import java.util.HashMap;


public class Almacen {
	private HashMap<Integer,Articulo>productos=new HashMap<>();

	/**
	 * @return the productos
	 */
	public HashMap<Integer, Articulo> getProductos() {
		return productos;
	}
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(HashMap<Integer, Articulo> productos) {
		this.productos = productos;
	}
	public void addProductos(Articulo articulo) {
		this.productos.put(articulo.getCodigo(), articulo);
	}
	public void eliminarProductos(Integer clave) {
		this.productos.remove(clave);
	}
	public void modificarProductos(Integer clave,Articulo articuloNuevo ) {
		this.productos.replace(clave, articuloNuevo );
	}
	public void entradaMercancia(Integer clave) {
		Articulo inflado=productos.get(clave);
		inflado.añadirStock();
	}
	public void salidaMercancia(Integer clave) {
		Articulo desInflado=productos.get(clave);
		desInflado.bajadaStock();
	}
	
}
