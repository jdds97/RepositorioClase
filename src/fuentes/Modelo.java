package fuentes;

import java.util.*;


public class Modelo {
	private HashMap<Comercial, TreeSet<Empresa>> asignaciones;
	private Vector<Visita> visitas;

	public Modelo() {
		this.asignaciones = new HashMap<>();
		this.visitas = new Vector<>();
	}

	public void añadeComercial(Comercial c) {
		// añade al mapa de asignaciones una nueva pareja con el comercial pasado como
		// parámetro y un conjunto nuevo vacío de empresas asignadas.z
		this.asignaciones.put(c, new TreeSet<>());
	}

	public void asignaEmpresaAComercial(Comercial c, Empresa e) {
		// asigna la empresa pasada como parámetro al conjunto de empresas que tiene
		// asignadas
		// el comercial pasado como parámetro.
		if (!this.asignaciones.containsKey(c))
			this.añadeComercial(c);
		this.asignaciones.get(c).add(e);
	}

	public void añadeVisita(Visita visita) {
		this.visitas.add(visita);
	}

	public boolean hayErrores() {
		// Devuelve true si hay alguna visita hecha por un comercial a una empresa que
		// NO estaba asignada a ese comercial.
		// Devuelve false en otro caso.

		for (Visita v : this.visitas)
			if (!this.asignaciones.get(v.getComercial()).contains(v.getEmpresa()))
				return true;
		return false;

	}

	public float totalComprasPorComercial(Comercial c) {
		// Devuelve el total de compras hechas por las empresas asignadas al comercial
		// pasado como parámetro.
		float totalCompras = 0;
		for (Empresa e : this.asignaciones.get(c))
			totalCompras += e.getCompras();
		return totalCompras;
	}

	public float totalVentasPorEmpresa(Empresa e) {
		// Devuelve el total de ventas hechas por todos los comerciales asignados a
		// la empresa pasada como parámetro.
		float totalVentas = 0;
		for (Comercial c : this.asignaciones.keySet())
			if (this.asignaciones.get(c).contains(e))
				totalVentas += c.getVentas();

		return totalVentas;
	}

	public TreeSet<Comercial> comercialesQueVisitaronEnElMes(int mes) {
		// Devuelve un TreeSet con todos los comerciales que hicieron alguna visita
		// en el mes pasado como parámetro.
		TreeSet<Comercial> comercialesMes = new TreeSet<>();
		for (Visita v : this.visitas)
			if (v.getMes() == mes)
				comercialesMes.add(v.getComercial());
		return comercialesMes;
	}

	public TreeSet<String> nombresDeEmpresasNoVisitadas() {
		// Devuelve un TreeSet con todas las empresas que no han recibido ninguna
		// visita.
		TreeSet<String> nombresEmpresas = new TreeSet<>();

		for (TreeSet<Empresa> empresas : this.asignaciones.values()) {
			for (Empresa e : empresas) {
				boolean visitada = false;
				for (Visita v : visitas)
					if (v.getEmpresa().equals(e))
						visitada = true;
				if (!visitada)
					nombresEmpresas.add(e.getNombre());

			}
		}
		return nombresEmpresas;

	}

	public TreeMap<Comercial, LinkedList<Visita>> mapaVisitasPorComercial() {
		// Devuelve un mapa con todos los comerciales como claves, y el valor asociado a
		// cada comercial es una LinkedList de las visitas que ha hecho ese comercial.
		TreeMap<Comercial, LinkedList<Visita>> map = new TreeMap<>();

		for (Comercial c : this.asignaciones.keySet()) {
			LinkedList<Visita> visita = new LinkedList<Visita>();
			for (Visita v : visitas)
				if (v.getComercial().equals(c))
					visita.add(v);
			map.put(c, visita);
		}
		return map;
	}
}
