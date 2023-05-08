package Alumnos;

import java.util.ArrayList;

public class Grupo
{
	private String nombre;
	private ArrayList<Alumno> alumnos;
	
	public Grupo(String nombre)
	{
		super();
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public void anadeAlumno(Alumno a)
	{
		this.alumnos.add(a);
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public ArrayList<Alumno> getAlumnos()
	{
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos)
	{
		this.alumnos = alumnos;
	}

	@Override
	public String toString()
	{
		String res="";
		res+="GRUPO: "+this.nombre+"\n";
		for(Alumno al:this.alumnos)
			res+="   "+al+"\n";
		
		return res;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
