package poo_modelo;

import java.text.SimpleDateFormat;

public class Pelicula extends Productos {
	private int idPelicula;
	protected SimpleDateFormat fechaAlquiler;
	private double calificacion;
	private String genero;
	private int duracion;
	private SimpleDateFormat fechaLanzamiento;
	private double precioAlquiler;

	/**
	 * @param nombre
	 * @param id
	 * @param tipo
	 * @param precio
	 * @param disponibilidad
	 */
	public Pelicula(String nombre, int id, String tipo, int precio, boolean disponibilidad) {
		super(nombre, id, tipo, precio, disponibilidad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idPelicula
	 */
	public int getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula the idPelicula to set
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * @return the fechaAlquiler
	 */
	public SimpleDateFormat getFechaAlquiler() {
		return fechaAlquiler;
	}

	/**
	 * @param fechaAlquiler the fechaAlquiler to set
	 */
	public void setFechaAlquiler(SimpleDateFormat fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the fechaLanzamiento
	 */
	public SimpleDateFormat getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	/**
	 * @param fechaLanzamiento the fechaLanzamiento to set
	 */
	public void setFechaLanzamiento(SimpleDateFormat fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	/**
	 * @return the precioAlquiler
	 */
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	/**
	 * @param precioAlquiler the precioAlquiler to set
	 */
	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

}