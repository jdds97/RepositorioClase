package Aerolinea;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Modelo {
	private TreeMap<Localidad, HashSet<Vuelo>> conexiones;
	private TreeSet<LineaAerea> líneas;

	public Modelo() {
		this.conexiones = new TreeMap<Localidad, HashSet<Vuelo>>();
		this.líneas = new TreeSet<LineaAerea>();
	}

	public void añadirLínea(LineaAerea línea) {
		this.líneas.add(línea);
	}

	public void añadirLocalidad(Localidad localidad)
	// añade al mapa de conexiones una nueva pareja con la localidad
	// pasada como parámetro y un nuevo conjunto de vuelos vacío.

	{
		this.conexiones.put(localidad, new HashSet<Vuelo>());
	}

	public void añadirVueloALocalidad(Localidad localidad, Vuelo vuelo)
	// añade el vuelo pasado como parámetro al conjunto de vuelos asociado a
	// la localidad pasada como parámetro.
	{
		if (this.conexiones.containsKey(localidad))
			this.conexiones.get(localidad).add(vuelo);
		else {
			this.añadirLocalidad(localidad);
			this.conexiones.get(localidad).add(vuelo);
		}

	}

	public boolean hayErrores()
	// devuelve un boolean indicando si hay errores en los datos, es decir,
	// si hay algún vuelo con la misma localidad de origen que de destino.
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
	// devuelve un entero con el número de vuelos que parten de la localidad
	// pasada como parámetro y llegan a localidades con más de 1.000.000 habs.
	{
		int numeroV = 0;
		for (Vuelo v : this.conexiones.get(loc)) {
			if (v.getDestino().getHabitantes() > 1000000)
				numeroV++;

		}
		return numeroV;
	}

	public TreeSet<LineaAerea> lineasHasta(Localidad localidad)
	// devuelve un TreeSet con todas las líneas aéreas que tienen vuelos hacia
	// la localidad pasada como parámetro.
	{
		TreeSet<LineaAerea> li = new TreeSet<>();
		for (HashSet<Vuelo> l : this.conexiones.values())
			for (Vuelo v : l)
				if (v.getDestino().equals(localidad))
					li.add(v.getLinea());
		return li;

	}

	public int totalAvionesDesde(Localidad localidad)
	// devuelve un entero con la suma de todos los aviones que tienen las líneas
	// que hacen vuelos desde la localidad pasada como parámetro.
	{
		int suma = 0;
		TreeSet<LineaAerea> arbol = new TreeSet<>();
		for (Vuelo v : this.conexiones.get(localidad))
			if (!arbol.contains(v.getLinea())) {
				arbol.add(v.getLinea());
				suma += v.getLinea().getNumAviones();
			}
		return suma;

	}

	public boolean hayVuelosReciprocos()
	// devuelve un boolean indicando si existen dos ciudades entre las que hay
	// vuelos en los dos sentidos.
	{
		for (Localidad origen : this.conexiones.keySet()) {
			for (HashSet<Vuelo> destinos : this.conexiones.values()) {
				for (Vuelo destino: destinos) {
					if (origen.equals(destino.getDestino()))
						return true;
				}
			}
		}
		return false;

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
