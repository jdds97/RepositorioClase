package fuentes;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Disco implements Comparable<Disco> {
	private String titulo;
	private LinkedList<Cancion> canciones = new LinkedList<>();
	
	
	public Disco(String titulo) {
		
		this.titulo = titulo;
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void add(Cancion cancion) {
		canciones.add(null);
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = (LinkedList<Cancion>) canciones;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disco other = (Disco) obj;
		return Objects.equals(titulo, other.titulo);
	}

	public String toString() {
		String res = "";

		res += "Disco: " + this.titulo + "\n";
		for (Cancion c : this.canciones)
			res += "     " + c.getDuracion() + "\n";
		return res;
	}

	@Override
	public int compareTo(Disco o) {
		return this.titulo.compareTo(o.titulo);
	}
}
