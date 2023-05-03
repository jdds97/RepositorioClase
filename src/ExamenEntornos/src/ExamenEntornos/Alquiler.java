package ExamenEntornos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alquiler {
	private Cliente cliente;
	private Inquilino inquilino;
	private Piso piso;
	private LocalDate fechaInicioAlquiler;
	private List<Alquiler> alquileres = new ArrayList<>();

	public Alquiler(Inquilino inquilino, Piso piso, LocalDate fechaInicio) {
		this.inquilino = inquilino;
		this.piso = piso;
		this.fechaInicioAlquiler = fechaInicio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	

	
	
	public LocalDate getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	public void setFechaInicioAlquiler(LocalDate fechaInicioAlquiler) {
		this.fechaInicioAlquiler = fechaInicioAlquiler;
	}
	public double getprecioAlquilerPiso() {

		return piso.getPrecioAlquiler() - (piso.getPrecioAlquiler() * inquilino.descuento());
	}

	public Alquiler getPrecioAlquilerMasCaro() {
		Alquiler alquilerPisoMasCaro = this.alquileres.get(0);
		for (int i = 1; i < this.alquileres.size(); i++) {

			if ((this.alquileres.get(0) != null)
					&& this.alquileres.get(i).getprecioAlquilerPiso() > alquilerPisoMasCaro.getprecioAlquilerPiso()) {
				alquilerPisoMasCaro = this.alquileres.get(i);

			}
		}

		return alquilerPisoMasCaro;
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", inquilino=" + inquilino + ", piso=" + piso + ", fechaInicioAlquiler="
				+ fechaInicioAlquiler + ", precioAlquilerPiso()=" + getprecioAlquilerPiso() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, fechaInicioAlquiler, piso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(fechaInicioAlquiler, other.fechaInicioAlquiler)
				&& Objects.equals(piso, other.piso);
	}

}
