package Examen2TrimestreModelo;

import java.time.LocalDate;

import Examen2Modelo.ComicClasico;

public abstract class ComicClasicoMal {

	private int idComic;
	public static int id;
	private String titulo;
	private String subTitulo;
	private LocalDate fecha = LocalDate.now();
	private String genero;
	private int precio;

	public ComicClasicoMal() {

		ComicClasicoMal.id++;
		this.idComic = id;
	}

	/**
	 * @return the titulo
	 */

	public String getTitulo() {

		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the id
	 */
	public int getId() {

		return id;
	}

	public int getIdComic() {

		return idComic;
	}
	public abstract double constante();
	public double getIdRelevancia() {
		return precio * constante();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComicClasico other = (ComicClasico) obj;
		return getId() == other.getIdComic();
	}
	@Override
	public String toString() {
		return "-Identificador=" + idComic + "\n " + (titulo != null ? "Titulo:" + titulo + "\n " : "")
				+ (fecha != null ? "Fecha:" + fecha + ", " : "") + (genero != null ? "Genero:" + genero + "\n " : "")
				+ "Precio:" + precio + "\n " + (getIdRelevancia() != 0 ? "idRelevancia=" + getIdRelevancia() : "")
				+ "]";
	}

}
