package fuentes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Modelo extends HashMap<Grupo, TreeSet<Disco>> {
	/**
	 * 
	 */

	public boolean anadeCancionADiscoDeGrupo(Grupo grupoP, Disco discoP, Cancion cancion) {
		boolean existe = false;

		if (this.get(grupoP) != null && discoP != null && this.get(grupoP).contains(discoP)) {
			discoP.add(cancion);
			existe = true;
		}
		return existe;
	}

	public HashSet<Musico> musicosEnCancion(Cancion cancionP) {
		HashSet<Musico> musicos1Vez = new HashSet<>();
		for (Grupo grupo : this.keySet())
			for (Disco discoMusico : grupo.getDiscos())
				for (Musico musico : grupo.getMusicos())
					if (discoMusico.getCanciones().contains(cancionP))
						musicos1Vez.add(musico);

		return musicos1Vez;
	}

	public LinkedList<Cancion> cancionesDeMusico(Musico musico) {
		LinkedList<Cancion> cancionesMusico = new LinkedList<>();
		for (Disco discoMusico : musico.getGrupoMusico().getDiscos())
			for (Cancion cancion : discoMusico.getCanciones()) {
				cancionesMusico.add(cancion);
			}
		return cancionesMusico;
	}

	public Map<Musico, Integer> discosParticipaCadaMusico() {
		HashMap<Musico, Integer> discosParticipante = new HashMap<>();
		for (Grupo grupo : keySet())
			for (Musico musico : grupo.getMusicos()) {
				discosParticipante.put(musico, grupo.getDiscos().size());
			}
		return discosParticipante;

	}

	public String listadoTitulosDiscosPorDuracion() {
		String listado = null;
		for (Grupo grupo : this.keySet())
			for (Disco discoGrupo : grupo.getDiscos())
				listado = discoGrupo.toString();
		return listado;
	}

}
