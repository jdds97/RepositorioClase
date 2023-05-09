package Examen3ºEvaluacion.model;

import java.util.Objects;

import Examen3ºEvaluacion.interfaces.IHashtag;

public class Hashtag implements IHashtag {
	// Declaracion de variable String para el nombre
	private String nombre;

	// Creamos el constructor vacio para despues settear sus atributos si fuera
	// necesario
	public Hashtag() {
		// TODO
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Hashtag other = (Hashtag) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Hashtag [" + (nombre != null ? "nombre=" + nombre : "") + "]";
	}

}
