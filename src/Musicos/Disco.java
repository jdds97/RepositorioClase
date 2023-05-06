package Musicos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Disco extends ArrayList<Cancion> implements Comparable<Disco> {
	private String titulo;

	public Disco( String titulo) {
		super();
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
		for (Cancion c : this)
			res += "     " + c.getDuracion() + "\n";
		return res;
	}

	@Override
	public int compareTo(Disco o) {
		return this.titulo.compareTo(o.titulo);
	}
	Comparator<Disco> comparadorDuracion = new Comparator<Disco>() {
        @Override
        public int compare(Disco disco1, Disco disco2) {
            int duracion1 = 0;
            for (Cancion cancion :disco1) {
                duracion1 += cancion.getDuracion();
            }
            int duracion2 = 0;
            for (Cancion cancion : disco2) {
                duracion2 += cancion.getDuracion();
            }
            return Integer.compare(duracion1, duracion2);
        }
    };
}
