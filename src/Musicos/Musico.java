package Musicos;

import java.util.Objects;

public class Musico 
{
	private String nombre;
	private int edad;
	private Grupo grupoMusico;
	
	public Musico(String nombre, int edad)
	
	{
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public Grupo getGrupoMusico() {
		return grupoMusico;
	}

	public void setGrupoMusico(Grupo grupoMusico) {
		this.grupoMusico = grupoMusico;
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
		Musico other = (Musico) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public String toString()
	{
		return this.nombre+"-"+this.edad;
	}
}
