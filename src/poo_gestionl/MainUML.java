package poo_gestionl;


import java.time.LocalDate;

import poo_modelo.Alquiler;
import poo_modelo.Cliente;
import poo_modelo.Pelicula;

public class MainUML {

	public static void main(String[] args) {
		  Cliente jesus=new Cliente("Jesus", 25,"Avenida de las Razas", "692638767");
		  Pelicula pelicula = new Pelicula("El rey leon", 1, "Animacion", 118, true);
		  Alquiler jesusPelicula=new Alquiler(jesus, pelicula, LocalDate.parse("19-01-2022"));
		  System.out.println(jesusPelicula.getFechaAlquiler());
	}

}
