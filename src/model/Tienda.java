package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import interfaces.IProducto;
import interfaces.ITienda;
import interfaces.IValoracion;


public class Tienda implements ITienda {
	private List<IProducto> productos= new ArrayList<IProducto>();
	public Tienda() {
   // TODO document why this constructor is empty
 }
	public List<IProducto> getProductos() {
		return productos;
	}

	public void setProductos(List<IProducto> productos) {
		this.productos = productos;
	}
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
			if(producto!=null) {
			if(producto.getValoracionMedia()>=mejorValoracion) {
				mejorValoracion=producto.getValoracionMedia();
				mejorValorado=producto;
			}
			}
		}
		return mejorValorado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tienda other = (Tienda) obj;
		return Objects.equals(productos, other.productos);
	}

	@Override
	public int compareTo(ITienda o) {
		int numeroSaliente;
		if (this.productos.size() == o.getProductos().size()) {
			numeroSaliente = 0;
		} else if (this.productos.size() <o.getProductos().size()) {
			numeroSaliente = -1;
		} else {
			numeroSaliente = 1;
		}
		return numeroSaliente;		
	}
	@Override
	public String toString() {
		return "Tienda [" + (productos != null ? "productos=" + productos : "") + "]";
	}


	

}
