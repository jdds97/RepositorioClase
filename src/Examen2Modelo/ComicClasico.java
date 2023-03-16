package Examen2Modelo;

import java.time.LocalDate;
import java.util.Arrays;



public abstract class ComicClasico {
	private double nivelRelevanciaMedio;
	private int idComic;
	private static int id;
	private String titulo;
	private String subTitulo;
	private LocalDate fecha = LocalDate.now();
	private String genero;
	private int precio;

	public ComicClasico() {
		this.id++;
		this.idComic = this.id;
	}


	public int setAmericanITQ(int eleccionITQ) {
		return setAmericanITQ(eleccionITQ);

	}

	public void setNivelRelevanciaMedio(double nivelDeRelevanciaMedio) {
		this.nivelRelevanciaMedio+=nivelDeRelevanciaMedio;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getSubTitulo() {
		return subTitulo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getGenero() {
		return genero;
	}


	public int getPrecio() {
		return precio;
	}


	public int getIdComic() {
		// TODO Auto-generated method stub
		return idComic;
	}
	
	public double getNivelRelevanciaMedio() {
		return nivelRelevanciaMedio;
	}
	/**
	 * @return Retorna el nivel de relevancia según sea un comic Americano u
	 *         Estándar ya que cambian las constantes en cada clase.
	 */
	public double getNivelDeRelevancia() {
		return precio * constante();
	}

	/**
	 * Metodo abstracto para implementarlo en cada clase según sea el valor del dato
	 * en cada clase que se vaya a implementar nuevamente
	 * 
	 * @return
	 */
	public abstract double constante();

	/**
	 * Metodo equals para saber si son el mismo comic a través de su id
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComicClasico other = (ComicClasico) obj;
		return idComic == other.idComic;
	}


	@Override
	public String toString() {
		return "ComicClasico [nivelRelevanciaMedio=" + nivelRelevanciaMedio + ", idComic=" + idComic + ", titulo="
				+ titulo + ", subTitulo=" + subTitulo + ", fecha=" + fecha + ", genero=" + genero + ", precio=" + precio;
	}

	

	/**
	 * Metodo toString para saber los datos del comic
	 */
	
	
}
