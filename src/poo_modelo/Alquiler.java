	package poo_modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Alquiler {
		  private Cliente cliente;
		  private Pelicula pelicula;
		  private LocalDate fechaAlquiler;
		  
		  public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate fechaAlquiler) {
		    this.cliente = cliente;
		    this.pelicula = pelicula;
		    this.fechaAlquiler = fechaAlquiler;
		  }
		  
		  public Cliente getCliente() {
		    return cliente;
		  }
		  
		  public Pelicula getPelicula() {
		    return pelicula;
		  }
		  
			public LocalDate getFechaAlquiler() {
		    return fechaAlquiler;
		  }
		}
