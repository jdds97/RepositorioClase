package poo_modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	private Cliente cliente;
	private LocalDate fechaInicioAlquiler;
	private LocalDate fechaFinalAlquiler;
	private Barco barco;
	private int diasDeOcupacion;
	protected int precioAlquiler;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public Alquiler(Cliente cliente, String fechaInicio, String fechaFinal, Barco barco) {
		this.cliente = cliente;
		this.fechaInicioAlquiler = LocalDate.parse(fechaInicio, formatter);
		this.fechaFinalAlquiler = LocalDate.parse(fechaFinal, formatter);
		this.barco = barco;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getDiasDeOcupacion() {

		diasDeOcupacion = (int) ChronoUnit.DAYS.between(fechaInicioAlquiler, fechaFinalAlquiler);
		return diasDeOcupacion;

	}
	public int precioAlquiler() {
		this.precioAlquiler=this.diasDeOcupacion*barco.precioAlquilerBarco();
		return this.precioAlquiler;
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

	public  void setPrecioAlquiler(int precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public void setDiasDeOcupacion(int diasDeOcupacion) {
		this.diasDeOcupacion = diasDeOcupacion;
	}

}
