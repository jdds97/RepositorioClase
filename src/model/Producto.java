package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import colecciones.Empleado;
import interfaces.IProducto;
import interfaces.IUsuario;
import interfaces.IValoracion;

public class Producto implements IProducto,Comparable<Producto> {

	private String nombre;
	private double precio;
	private List<IValoracion> valoracion=new LinkedList<IValoracion>();
	
	public Producto() {
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio=precio;
	}

	@Override
	public void addValoracion(IValoracion valoracion) {
		this.valoracion.add(valoracion);
	}

	@Override
	public double getValoracionMedia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IValoracion> getValoracionPorUsuario(IUsuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public int compareTo(Producto p) {
		int numeroSaliente;
		if (this.precio==p.precio) {
			numeroSaliente=0;
		}
		else if (this.precio<p.precio) {
			numeroSaliente=-1;
		}
		else {
			numeroSaliente=1;
		}
			return numeroSaliente;
		}

}
