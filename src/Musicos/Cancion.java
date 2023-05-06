package Musicos;

import java.util.Objects;

public class Cancion
{
	private String nombre;
	private float duracion;
	private Disco discoCancion;
	public Cancion(float duracion,String nombre)
	{
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public String toString()
	{
		return this.nombre+"-"+this.duracion;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public float getDuracion()
	{
		return duracion;
	}
	
	public void setDuracion(float duracion)
	{
		this.duracion = duracion;
	}

	/**
	 * @return the discoCancion
	 */
	public Disco getDiscoCancion() {
		return discoCancion;
	}

	/**
	 * @param discoCancion the discoCancion to set
	 */
	public void setDiscoCancion(Disco discoCancion) {
		this.discoCancion = discoCancion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Float.floatToIntBits(duracion) == Float.floatToIntBits(other.duracion)
				&& Objects.equals(nombre, other.nombre);
	}
	
}
