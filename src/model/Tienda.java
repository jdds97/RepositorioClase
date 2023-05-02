package model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import interfaces.IProducto;
import interfaces.ITienda;

public class Tienda implements ITienda {
	private List<IProducto> productos= new LinkedList<IProducto>();
	@Override
	public void addProducto(IProducto producto) {
		productos.add(producto);
	}

	@Override
	public List<IProducto> getProductosOrdenadosPorPrecio() {
		Collections.sort(this.productos);
		return null;
	}

	@Override
	public IProducto getProductoMejorValoracion() {
		// TODO Auto-generated method stub
		return null;
	}

}
