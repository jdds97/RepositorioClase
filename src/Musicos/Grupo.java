package Musicos;

import java.util.HashSet;
import java.util.Objects;


public class Grupo {
	private String nombre;
	private HashSet<Musico> musicos = new HashSet<>();

	public Grupo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public HashSet<Musico> getMusicos() {
		return musicos;
	}

	public void setMusicos(HashSet<Musico> musicos) {
		this.musicos = musicos;
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
