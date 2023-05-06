package Aerolinea;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Modelo {
	private TreeMap<Localidad, HashSet<Vuelo>> conexiones;
	private TreeSet<LineaAerea> l�neas;

	public Modelo() {
		this.conexiones = new TreeMap<Localidad, HashSet<Vuelo>>();
		this.l�neas = new TreeSet<LineaAerea>();
	}

	public void a�adirL�nea(LineaAerea l�nea) {
		this.l�neas.add(l�nea);
	}

	public void a�adirLocalidad(Localidad localidad)
	// a�ade al mapa de conexiones una nueva pareja con la localidad
	// pasada como par�metro y un nuevo conjunto de vuelos vac�o.

	{
		this.conexiones.put(localidad, new HashSet<Vuelo>());
	}

	public void a�adirVueloALocalidad(Localidad localidad, Vuelo vuelo)
	// a�ade el vuelo pasado como par�metro al conjunto de vuelos asociado a
	// la localidad pasada como par�metro.
	{
		if (this.conexiones.containsKey(localidad))
			this.conexiones.get(localidad).add(vuelo);

	}

	public boolean hayErrores()
	// devuelve un boolean indicando si hay errores en los datos, es decir,
	// si hay alg�n vuelo con la misma localidad de origen que de destino.
	{
		for (Localidad l : this.conexiones.keySet()) {
			for (Vuelo v : this.conexiones.get(l)) {
				if (v.getDestino().equals(l))
					return true;
			}
		}
		return false;
	}

	public int numVuelosALocsMillon(Localidad loc)
	// devuelve un entero con el n�mero de vuelos que parten de la localidad
	// pasada como par�metro y llegan a localidades con m�s de 1.000.000 habs.
	{
		int numeroV = 0;
		for (Vuelo v : this.conexiones.get(loc)) {
			if (v.getDestino().getHabitantes() > 1000000)
				numeroV++;

		}
		return numeroV;
	}

	public TreeSet<LineaAerea> lineasHasta(Localidad localidad)
	// devuelve un TreeSet con todas las l�neas a�reas que tienen vuelos hacia
	// la localidad pasada como par�metro.
	{
		TreeSet<LineaAerea> li = new TreeSet<>();
		for(Localidad v:this.conexiones.keySet())
		
		
		return li;
	}

	public int totalAvionesDesde(Localidad localidad)
	// devuelve un entero con la suma de todos los aviones que tienen las l�neas
	// que hacen vuelos desde la localidad pasada como par�metro.
	{
	int suma=0;
	for(Vuelo v :t)
	}

	public boolean hayVuelosReciprocos()
	// devuelve un boolean indicando si existen dos ciudades entre las que hay
	// vuelos en los dos sentidos.
	{
	}

	public String toString() {
		String res = "";
		for (Localidad l : this.conexiones.keySet()) {
			res += "\nDesde: " + l.getNombre() + " hasta:\n";
			for (Vuelo v : this.conexiones.get(l))
				res += v.getDestino().getNombre() + " con " + v.getLinea() + ", ";
		}

		return res;
	}

}
