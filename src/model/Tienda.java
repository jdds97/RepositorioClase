package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.IProducto;
import interfaces.ITienda;


public class Tienda implements ITienda {
	private ArrayList<IProducto> productos= new ArrayList<>();
	@Override
	public void addProducto(IProducto producto) {
		this.productos.add(producto);
	}

	@Override
	public List<IProducto> getProductosOrdenadosPorPrecio() {
		Collections.sort(this.productos);
		return this.productos;
	}

	@Override
	public IProducto getProductoMejorValoracion() {
		IProducto mejorValorado = null;
		double mejorValoracion=this.productos.get(0).getValoracionMedia();
		for(IProducto producto:this.productos) {
			if(producto.getValoracionMedia()>=mejorValoracion) {
				mejorValoracion=producto.getValoracionMedia();
				mejorValorado=producto;
			}
		}
		return mejorValorado;
	}

	

}
