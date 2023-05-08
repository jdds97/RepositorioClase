package Tinder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Modelo extends HashMap</* Gestor */Persona, /* Parejas hechas por gestor */ TreeMap<Persona, Persona>> {
	public static final int CORRECTO = 0;
	public static final int YA_EXISTE = 1;

	private LinkedHashSet<Persona> solicitantes = new LinkedHashSet<>();

	public Modelo() {
	}

	public int añadeSolicitante(String nombre, boolean solicitanteHombre, boolean solicitadoHombre, boolean gestor,
			List<String> aficiones) {
		Persona nuevoSolicitante = new Persona(nombre, solicitanteHombre, solicitadoHombre, gestor, aficiones);
		if (this.solicitantes.contains(nuevoSolicitante))
			return YA_EXISTE;
		this.solicitantes.add(new Persona(nombre, solicitanteHombre, solicitadoHombre, gestor, aficiones));
		return CORRECTO;

	}

	public Set<Persona> getListaGestores() {
		Set<Persona> sonG = new TreeSet<>();
		for (Persona p : this.solicitantes)
			if (p.isGestor())
				sonG.add(p);
		return sonG;
	}

	public Set<Persona> getListaSolicitantes() {

		return this.solicitantes;
	}

	private Persona getPersonaLlamada(String nombre) {

		for (Persona p : this.solicitantes)
			if (p.getNombre().equals(nombre))
				return p;
		return null;
	}

	public String getListadoAfinidades(String nombreSolicitante) {

		String res = "";
		Persona solicitante = this.getPersonaLlamada(nombreSolicitante);
		for (Persona posiblePareja : this.solicitantes)
			if (solicitante.isSexoPropio() == solicitante.isSexoBuscado()
					&& solicitante.isSexoBuscado() == posiblePareja.isSexoPropio()
					&& !solicitante.equals(posiblePareja))
				res += "Aficiones comunes de " + solicitante.getNombre() + "y" + posiblePareja.getNombre() + ": "
						+ solicitante.aficionesComunesCon(posiblePareja) + "\n";
		return res;
	}

	public int creaPareja(String nombreGestor, String nombreSolicitante, String nombrePareja) {
		Persona solicitante = this.getPersonaLlamada(nombreSolicitante);
		Persona gestor = this.getPersonaLlamada(nombreGestor);
		Persona pareja = this.getPersonaLlamada(nombrePareja);
		for (Persona ges : this.keySet())
			if (this.get(ges).containsKey(solicitante) || this.get(ges).containsValue(solicitante)
					|| this.get(ges).containsKey(pareja) || this.get(ges).containsValue(pareja))
				return YA_EXISTE;
		if (!this.containsKey(gestor))
			this.put(gestor, new TreeMap<Persona, Persona>());
		this.get(gestor).put(solicitante, pareja);
		return CORRECTO;

	}

	public String getListadoSolicitantes() {
		String res = "";
		for (Persona p : this.solicitantes)
			res += p + "\n";
		return res;
	}

	public String getListadoParejas() {
		String res = "";
		for (Persona ges : this.keySet())
			for (Persona pareja1 : this.get(ges).keySet())
				for (Persona pareja2 : this.get(ges).values()) {
					res += "Gestor.........: " + ges.getNombre() + "\n" + "Parejas hechas .:" + "\n"
							+ "                 " + pareja1.getNombre() + " + " + pareja2.getNombre();
				}

		return res;
	}

}
