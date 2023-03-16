package Examen2Modelo;

import java.time.LocalDate;

public abstract class ComicClasico {
	private int idRelevanciaMayor;
	private int idRelevanciaMenor;
	private int idRelevanciaComic;
	private static int id;
	private String titulo;
	private String subTitulo;
	private LocalDate fecha = LocalDate.now();
	private String genero;
	private int precio;
	private ComicClasico[] idRelevancia;

	public ComicClasico() {
		this.id++;
		this.idRelevanciaComic = this.id;
	}

	/**
	 * @return the comicClasico
	 */
	public ComicClasico[] getComicClasico() {
		return idRelevancia;
	}

	/**
	 * @param comicClasico the comicClasico to set
	 */
	public void setComicClasico(ComicClasico[] comicClasico) {
		this.idRelevancia = comicClasico;
	}

	/**
	 * @param id
	 * @param titulo
	 * @param fecha
	 * @param genero
	 * @param precio
	 */

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
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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

	public int getRelevanciaMayor() {

		for (int i = 0; i < idRelevancia.length; i++) {
			if (!(this.idRelevancia[0] == null) && this.idRelevancia[i].getId() > this.idRelevanciaMayor) {
				this.idRelevanciaMayor = this.idRelevancia[i].getId();
			}
			if (!(this.idRelevancia[0] == null) && this.idRelevancia[i].getId() < this.idRelevanciaMenor) {
				this.idRelevanciaMenor = this.idRelevancia[i].getId();
			}

		}
		return this.idRelevanciaMayor;
	}

	public void darDeAltaComic(ComicClasico comic) {

		for (int i = 0; i < idRelevancia.length; i++) {
			if (this.idRelevancia[0] == (null))
				this.idRelevancia[0] = comic;

		}
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
		return getIdRelevanciaMayor() == other.getIdRelevanciaMayor();
	}

	public abstract void constante();

	@Override
	public String toString() {
		return "-Identificador=" + getIdRelevanciaMayor() + "\n " + (titulo != null ? "-Titulo:" + titulo + "\n " : "")
				+ (fecha != null ? "-Fecha:" + fecha + "\n " : "") + (genero != null ? "-Genero:" + genero + "\n " : "")
				+ "-Precio:" + precio + "\n " + (idRelevanciaComic != 0 ? "-idRelevancia=" + idRelevanciaComic : "");
	}

	public int getIdRelevanciaMayor() {
		return idRelevanciaMayor;
	}

	public int setAmericanITQ(int eleccionITQ) {
		return setAmericanITQ(eleccionITQ);

	}

	public int getIdRelevanciaMenor() {
		return idRelevanciaMenor;
	}

	public int getIdRelevanciaComic(ComicClasico[] comic) {
		for (int i = 0; i < idRelevancia.length; i++) {
			for (int j = 0; j < comic.length; j++) {
				this.idRelevancia[i].idRelevanciaComic = comic[j].idRelevanciaComic;
				this.idRelevanciaComic = this.idRelevancia[i].idRelevanciaComic;
			}
		}
		return this.idRelevanciaComic;
	}
}
