package ExamenEntornos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import poo_modelo.Cliente;
import poo_modelo.Piso;

public class Alquiler {
	private Cliente cliente;
	private Inquilino inquilino;
	private Piso piso;
	private LocalDate fechaInicioAlquiler;
	private LocalDate fechaFinalAlquiler;
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private List<Alquiler> alquileres =new ArrayList<>();
	
	public Alquiler getPrecioAlquilerMasCaro() {
		Alquiler alquilerPisoMasCaro=this.alquileres.get(0);
		for (int i = 1; i < this.alquileres.size(); i++) {
			
			if((this.alquileres.get(0)!=null) && this.alquileres.get(i).getprecioAlquilerPiso()>alquilerPisoMasCaro.getprecioAlquilerPiso()) {
				alquilerPisoMasCaro=this.alquileres.get(i);
				
			}
		}
		
		return alquilerPisoMasCaro;
	}
	
	

	public Alquiler(Cliente cliente, String fechaInicio, String fechaFinal) {
		this.cliente = cliente;
		this.fechaInicioAlquiler = LocalDate.parse(fechaInicio, formatter);
		this.fechaFinalAlquiler = LocalDate.parse(fechaFinal, formatter);

	}

	public Alquiler(Inquilino inquilino, Piso piso, String fechaInicio, String fechaFinal) {
		//this.alquiler=alquiler;
		this.inquilino = inquilino;
		this.piso = piso;
		this.fechaInicioAlquiler = LocalDate.parse(fechaInicio, formatter);
		this.fechaFinalAlquiler = LocalDate.parse(fechaFinal, formatter);
	}

	


	public Cliente getCliente() {
		return cliente;
	}

	public int getDiasDeOcupacion() {

		return (int) ChronoUnit.DAYS.between(fechaInicioAlquiler, fechaFinalAlquiler);

	}
	public double getprecioAlquilerPiso() {
		
		return piso.getPrecioAlquiler() - (piso.getPrecioAlquiler() * inquilino.descuento());
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", inquilino=" + inquilino + ", piso=" + piso + ", fechaInicioAlquiler="
				+ fechaInicioAlquiler + ", fechaFinalAlquiler=" + fechaFinalAlquiler + ", barco=" + "barco"
				+ ", precioAlquiler=" + "" + ", precioAlquilerPiso()=" + getprecioAlquilerPiso() + "]";
	}

	/**
	 * @return the fechaInicioAlquiler
	 */
	public LocalDate getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	/**
	 * @param fechaInicioAlquiler the fechaInicioAlquiler to set
	 */

	/**
	 * @return the fechaFinalAlquiler
	 */
	public LocalDate getFechaFinalAlquiler() {
		return fechaFinalAlquiler;
	}

	/**
	 * @param fechaFinalAlquiler the fechaFinalAlquiler to set
	 */
	public void setFechaFinalAlquiler(LocalDate fechaFinalAlquiler) {
		this.fechaFinalAlquiler = fechaFinalAlquiler;
	}


}
