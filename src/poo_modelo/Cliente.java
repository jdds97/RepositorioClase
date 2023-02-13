package poo_modelo;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Cliente extends PersonaVideoclub {
	  private int idCliente;
	  private List <Alquiler> alquileres;
	  
	  public Cliente(String nombre, int edad, String direccion, String telefono, int idCliente) {
	    super(nombre, edad, direccion, telefono);
	    this.idCliente = idCliente;
	    this.alquileres = new ArrayList<>();
	  }
	  
	  public int getIdCliente() {
	    return idCliente;
	  }
	  
	  public List<Alquiler> getAlquileres() {
	    return alquileres;
	  }
	  
	  public void agregarAlquiler(Alquiler alquiler) {
	    alquileres.add(alquiler);
	  }
	}
