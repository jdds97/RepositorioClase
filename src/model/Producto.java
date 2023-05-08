package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import interfaces.IProducto;
import interfaces.IUsuario;
import interfaces.IValoracion;

public class Producto implements IProducto, Comparable<IProducto> {

	private String nombre;
	private double precio;
	private List<IValoracion> valoraciones = new LinkedList<IValoracion>();

	public Producto() {
		// TODO document why this constructor is empty
	}

	@Override
	public String getNombre() {
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
	public List<IValoracion> getValoraciones() {
		return valoraciones;
	}

	@Override
	public void setValoraciones(List<IValoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	@Override
	public void addValoracion(IValoracion valoracion) {
		this.valoraciones.add(valoracion);
	}

	@Override
	public double getValoracionMedia() {
		int valoracionMedia = 0;
		for (IValoracion valoracion : this.valoraciones) {
			if (this.valoraciones != null)
				valoracionMedia += valoracion.getPuntuacion();
		}
		if (this.valoraciones.size() == 0) {
			valoracionMedia = 0;
		} else {
			valoracionMedia = valoracionMedia / this.valoraciones.size();
		}
		return valoracionMedia;
	}

	@Override
	public List<IValoracion> getValoracionPorUsuario(IUsuario usuario) {
		List<IValoracion> valoracionesUsuario = new LinkedList<IValoracion>();
		for (IValoracion valoracion : this.valoraciones) {
			if (valoracion != null) {
				if (valoracion.getUsuario().equals(usuario))
					valoracionesUsuario.add(valoracion);
			}
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
		int numeroSaliente = 0;
		if (this.precio == p.getPrecio()) {
			if (this.getValoracionMedia() == p.getValoracionMedia())
				numeroSaliente = 0;
			numeroSaliente=this.nombre.compareTo(p.getNombre());
				
			/*if (this.getValoracionMedia() < p.getValoracionMedia())
				numeroSaliente = -1;
			if (this.getValoracionMedia() > p.getValoracionMedia())
				numeroSaliente = 1;
				*/
		} else if (this.precio < p.getPrecio()) {
			
			numeroSaliente = -1;
		} else {
			numeroSaliente = 1;
		}
		return numeroSaliente;
	}

	@Override
	public String toString() {
		return "Producto [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + ", "
				+ (valoraciones != null ? "valoraciones=" + valoraciones : "") + "]";
	}
	
}
