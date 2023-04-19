package colecciones;


import java.util.HashMap;

import javax.swing.JOptionPane;


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
		if(articulo!=null)
		articulo.añadirStock();
		this.productos.put(articulo.getCodigo(), articulo);
	}
	public void addProductosExtendido(int codigo,String descripcion,double precioVenta ) {
		Articulo modificado =new Articulo(codigo, descripcion, precioVenta);
		this.productos.put(modificado.getCodigo(), modificado);
	}
	public void eliminarProductos(Integer clave) {
		if(this.productos.containsKey(clave))
		this.productos.remove(clave);
	}
	
	public void entradaMercancia(Articulo inflado) {
		if(this.productos.containsValue(inflado))
			inflado.añadirStock();
		else {
			JOptionPane.showMessageDialog(null, "El articulo no existe");;
		}
		
	}
	public void salidaMercancia(Articulo desinflado) {
		desinflado.bajadaStock();
	}
	
}
