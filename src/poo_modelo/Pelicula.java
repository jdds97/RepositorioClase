package poo_modelo;

import java.text.SimpleDateFormat;

public class Pelicula extends Productos {
	  private int idPelicula;
	  protected SimpleDateFormat fechaAlquiler;
	  
	  public Pelicula(String nombre, int id, String tipo, String genero, int duracion, SimpleDateFormat fechaLanzamiento, double precioAlquiler, boolean disponibilidad, double calificacion, int idPelicula) {
	    super(nombre, id, idPelicula, tipo, genero, duracion, fechaLanzamiento, precioAlquiler, disponibilidad, calificacion);
	    
	  }
	  
	  public int getIdPelicula() {
	    return idPelicula;
	  }
	}
