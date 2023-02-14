package poo_modelo;
import java.text.SimpleDateFormat;


public class Productos {
	  private String nombre;
	  private int id;
	  private String tipo;
	  private int precio;
	  private String genero;
	  private int duracion;
	  private SimpleDateFormat fechaLanzamiento;
	  private double precioAlquiler;
	  private boolean disponibilidad;
	  private double calificacion;
	  
	  public Productos(String nombre,int precio, int id, String tipo, String genero, int duracion, SimpleDateFormat fechaLanzamiento, double precioAlquiler, boolean disponibilidad, double calificacion) {
	    this.nombre = nombre;
	    this.id = id;
	    this.tipo = tipo;
	    this.genero = genero;
	    this.duracion = duracion;
	    this.fechaLanzamiento =new SimpleDateFormat("dd/MM/yyyy");
	    this.precioAlquiler = precioAlquiler;
	    this.disponibilidad = disponibilidad;
	    this.calificacion = calificacion;
	    this.precio=precio;
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
	  
	  public SimpleDateFormat getFechaLanzamiento() {
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	}
