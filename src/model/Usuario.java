package model;

import java.util.Objects;

import interfaces.IUsuario;


public class Usuario implements IUsuario {
	private String nombre;
	public Usuario() {
   // TODO document why this constructor is empty
 }
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
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
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}



	@Override
	public int compareTo(IUsuario o) {

		return this.nombre.compareTo(o.getNombre());
	}
	
}
