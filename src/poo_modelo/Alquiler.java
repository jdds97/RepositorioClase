	package poo_modelo;

import java.util.Date;

public class Alquiler {
		  private Cliente cliente;
		  private Pelicula pelicula;
		  private Date fechaAlquiler;
		  
		  public Alquiler(Cliente cliente, Pelicula pelicula, Date fechaAlquiler) {
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
		  
			public Date getFechaAlquiler() {
		    return fechaAlquiler;
		  }
		}
