package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import interfaces.IProducto;
import interfaces.IUsuario;
import interfaces.IValoracion;

public class Producto implements IProducto,Comparable<IProducto> {

	private String nombre;
	private double precio;
	private List<IValoracion> valoraciones = new LinkedList<IValoracion>();

	public Producto() {

	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void addValoracion(IValoracion valoracion) {
		this.valoraciones.add(valoracion);
	}
	@Override
	public List<IValoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(List<IValoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	@Override
	public double getValoracionMedia() {
		int valoracionMedia = 0;
		for (IValoracion valoraciones : this.valoraciones) {
			valoracionMedia += valoraciones.getPuntuacion();
		}
		if(this.valoraciones.size()==0) {
			valoracionMedia=0;
		}
		else {
		valoracionMedia = valoracionMedia / this.valoraciones.size();
		}
		return valoracionMedia;
	}

	@Override
	public List<IValoracion> getValoracionPorUsuario(IUsuario usuario) {
		List<IValoracion> valoracionesUsuario = new LinkedList<IValoracion>();
		for (IValoracion valoracion : this.valoraciones) {
			if (valoracion.getUsuario().equals(usuario))
				valoracionesUsuario.add(valoracion);

		}
		return valoracionesUsuario;
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
	public int compareTo(IProducto p) {
		int numeroSaliente;
		if (this.precio == p.getPrecio()) {
			numeroSaliente = 0;
		} else if (this.precio < p.getPrecio()) {
			numeroSaliente = -1;
		} else {
			numeroSaliente = 1;
		}
		return numeroSaliente;
	}

	


}
