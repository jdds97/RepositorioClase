package Musicos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Modelo extends HashMap<Grupo, TreeSet<Disco>> {
	public boolean anadeCancionADiscoDeGrupo(Grupo grupo, Disco disco, Cancion cancion) {
		// a�ade al modelo la canci�n recibida como par�metro, dentro del disco
		// recibido como par�metro, del grupo recibido como par�metro. Devuelve false
		// si no existe el grupo, o si el grupo no tiene ese disco, o si la canci�n ya
		// estaba en el disco (en cualquiera de esos casos, no se a�ade nada).
		// Devuelve true si se a�ade la canci�n al disco del grupo.
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
		// devuelve un HashSet con los m�sicos que alguna vez en alg�n grupo
		// han grabado la canci�n recibida como par�metro.
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
		// el m�sico recibido como par�metro. No debe contener canciones repetidas
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
		// devuelve un HashMap en el que las claves son todos los m�sicos del modelo.
		// El valor asociado a cada m�sico es el n�mero de discos en los que ha
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
		// devuelve un String con varias l�neas. Cada l�nea corresponde a cada uno de
		// los discos almacenados en el modelo. Cada l�nea tiene el nombre del disco,
		// y su duraci�n total (la de todas sus canciones). Las l�neas deben estar
		// ordenadas alfab�ticamente por el t�tulo del disco, como se muestra en los
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
