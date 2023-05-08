package Tinder;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Persona extends /* Gustos de la persona */LinkedList<String> implements Comparable<Persona> {
	public static final boolean HOMBRE = true;
	public static final boolean MUJER = false;

	private String nombre;
	private boolean sexoPropio;
	private boolean sexoBuscado;
	private boolean gestor;

	public Persona(String nombre, boolean sexoPropio, boolean sexoBuscado, boolean esGestor, List<String> gustos) {

		this.nombre = nombre;
		this.sexoPropio = sexoPropio;
		this.sexoBuscado = sexoBuscado;
		this.gestor = esGestor;
		this.addAll(gustos);
	}

	public String aficionesComunesCon(Persona otra) {
		String res = "";
		for (String gustos : this)
			if (otra.contains(gustos))
				res += gustos+", ";
		//Metodo para quitar la coma del final
		return res.substring(0, res.length()-2);
	}

	public String toString() {
		String res= "";
		res+= "Nombre.......:" + this.nombre+"\n";
		res+= "Sexo propio..:" + (sexoPropio?"Hombre":"Mujer")+"\n";
		res+= "Sexo buscado.:" + (sexoBuscado?"Hombre":"Mujer")+"\n";
		res+= "Es gestor....:" + (gestor?"Si":"No")+"\n";
		res+="Aficiones....:"+"\n";
		for (String aficion : this) {
			res+="               "+aficion+"\n";
		}
		return res;
	}

	public boolean isGestor() {
		return gestor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public boolean isSexoPropio() {
		return sexoPropio;
	}

	public boolean isSexoBuscado() {
		return sexoBuscado;
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
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

}
