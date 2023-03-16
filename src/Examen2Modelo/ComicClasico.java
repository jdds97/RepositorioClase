package Examen2Modelo;

import java.time.LocalDate;




public abstract class ComicClasico {
	private double nivelRelevanciaMedio;
	private int idComic;
	private static int id;
	private String titulo;
	private String subTitulo;
	private LocalDate fecha = LocalDate.now();
	private String genero;
	private int precio;
	/**
	 * Constructor con id estatico para que asigne un id diferente cada vez que se cree un comic
	 */
	public ComicClasico() {
		this.id++;
		this.idComic = this.id;
	}

	/**
	 * 
	 * @param nivelDeRelevanciaMedio
	 */
	public void setNivelRelevanciaMedio(double nivelDeRelevanciaMedio) {
		this.nivelRelevanciaMedio+=nivelDeRelevanciaMedio;
	}
	/**
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * 
	 * @param subTitulo
	 */
	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	/**
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * 
	 * @return subTitulo
	 */
	public String getSubTitulo() {
		return subTitulo;
	}
	/**
	 * 
	 * @return fecha
	 */


	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}


	public int getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @return idComic
	 */
	public int getIdComic() {
		return idComic;
	}
	/**
	 * 
	 * @return nivelRelevanciaMedio
	 */
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
	public abstract void setITQ(int americanITQ);
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

	/**
	 * Metodo toString para saber los datos del comic
	 */
	
	@Override
	public String toString() {
		return ">Identificador : " + idComic + "\n" +">Titulo : " + titulo + "\n" +">SubTitulo : " + subTitulo + "\n" +">Fecha : "
				+ fecha + "\n" +">Precio : " + precio + "\n" +">Genero : " + genero;
	}

	
	
	
}
