package fuentes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Grupo {
	private final String nombre;
	private LinkedList<Musico> musicos = new LinkedList<>();
	private HashSet<Disco> discos = new HashSet<>();

	public Grupo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public LinkedList<Musico> getMusicos() {
		return musicos;
	}

	public void setMusicos(LinkedList<Musico> musicosP) {
		this.musicos = musicosP;
	}

	public String toString() {
		String res = "";
		res = "Grupo: " + this.nombre + "\n";
		for (Musico m : musicos)
			res += "   " + m + "\n";
		return res;
	}

	public void anadeMusico(Musico musico) {
		musicos.add(musico);
	}

	public HashSet<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(Set<Disco> discos) {
		this.discos = (HashSet<Disco>) discos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
