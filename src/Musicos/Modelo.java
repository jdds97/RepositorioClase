package Musicos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Modelo extends HashMap<Grupo, TreeSet<Disco>> {
	public boolean anadeCancionADiscoDeGrupo(Grupo grupo, Disco disco, Cancion cancion) {
		// añade al modelo la canción recibida como parámetro, dentro del disco
		// recibido como parámetro, del grupo recibido como parámetro. Devuelve false
		// si no existe el grupo, o si el grupo no tiene ese disco, o si la canción ya
		// estaba en el disco (en cualquiera de esos casos, no se añade nada).
		// Devuelve true si se añade la canción al disco del grupo.
		boolean existe = false;
		for (Grupo g : this.keySet())
			for (Disco d : this.get(g))
				if (g.equals(grupo) && d.equals(disco) && !d.contains(cancion)) {
					d.add(cancion);
					existe = true;
				}
		return existe;

	}

	public HashSet<Musico> musicosEnCancion(Cancion cancion) {
		// devuelve un HashSet con los músicos que alguna vez en algún grupo
		// han grabado la canción recibida como parámetro.
		HashSet<Musico> mCan = new HashSet<>();
		for (Grupo g : this.keySet())
			for (Disco d : this.get(g))
				for (Musico m : g.getMusicos())
					if (d.contains(cancion))
						mCan.add(m);

		return mCan;
	}

	public LinkedList<Cancion> cancionesDeMusico(Musico musico) {
		// devuelve una LinkedList con todas las canciones en las que ha participado
		// el músico recibido como parámetro. No debe contener canciones repetidas
		LinkedList<Cancion> cancionesMusico = new LinkedList<Cancion>();
		for (Grupo g : this.keySet())
			for (Disco d : this.get(g))
				for (Musico m : g.getMusicos())
					for (Cancion cancion : d)
						if (m.equals(musico) && !cancionesMusico.contains(cancion))
							cancionesMusico.add(cancion);

		return cancionesMusico;
	}

	public HashMap<Musico, Integer> discosParticipaCadaMusico() {
		// devuelve un HashMap en el que las claves son todos los músicos del modelo.
		// El valor asociado a cada músico es el número de discos en los que ha
		// participado.
		HashMap<Musico, Integer> musicos = new HashMap<>();

		int total = 0;
		for(Grupo g : this.keySet())
			for(Musico m : g.getMusicos())
				musicos.put(m,0);
		for(Musico m : musicos.keySet())
			for(Grupo g : this.keySet())
				if(g.getMusicos().contains(m))
					musicos.put(m, musicos.get(m) + this.get(g).size());
		
		return musicos;

	}

	public String listadoTitulosDiscosPorDuracion() {
		// devuelve un String con varias líneas. Cada línea corresponde a cada uno de
		// los discos almacenados en el modelo. Cada línea tiene el nombre del disco,
		// y su duración total (la de todas sus canciones). Las líneas deben estar
		// ordenadas alfabéticamente por el título del disco, como se muestra en los
		// datos de ejemplo.
		String res = "";
		float total = 0;
		
		for(TreeSet<Disco> discos : this.values())
		{
			total = 0;
			for(Disco d : discos)
			{
				res+= d.getTitulo() + " - ";
				for(Cancion c : d)
					total+= c.getDuracion();
			}
			res+= total + "\n";
		}
			
		
		return res;

	}
}
