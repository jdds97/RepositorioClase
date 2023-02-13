package poo_modelo;

import java.util.Date;

public class Producto {
	  private String nombre;
	  private int id;
	  private String tipo;
	  private String genero;
	  private int duracion;
	  private Date fechaLanzamiento;
	  private double precioAlquiler;
	  private boolean disponibilidad;
	  private double calificacion;
	  
	  public Producto(String nombre, int id, String tipo, String genero, int duracion, Date fechaLanzamiento, double precioAlquiler, boolean disponibilidad, double calificacion) {
	    this.nombre = nombre;
	    this.id = id;
	    this.tipo = tipo;
	    this.genero = genero;
	    this.duracion = duracion;
	    this.fechaLanzamiento = fechaLanzamiento;
	    this.precioAlquiler = precioAlquiler;
	    this.disponibilidad = disponibilidad;
	    this.calificacion = calificacion;
	  }
	  
	  public String getNombre() {
	    return nombre;
	  }
	  
	  public int getId() {
	    return id;
	  }
	  
	  public String getTipo() {
	    return tipo;
	  }
	  
	  public String getGenero() {
	    return genero;
	  }
	  
	  public int getDuracion() {
	    return duracion;
	  }
	  
	  public Date getFechaLanzamiento() {
	    return fechaLanzamiento;
	  }
	  
	  public double getPrecioAlquiler() {
	    return precioAlquiler;
	  }
	  
	  public boolean isDisponibilidad() {
	    return disponibilidad;
	  }
	  
	  public double getCalificacion() {
	    return calificacion;
	  }
	  
	  public void setDisponibilidad(boolean disponibilidad) {
	    this.disponibilidad = disponibilidad;
	  }
	}
