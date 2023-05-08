package Alumnos;
public class Alumno implements Comparable<Alumno>
{
	private String nombre;

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public Alumno(String nombre)
	{
		super();
		this.nombre = nombre;
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
		Alumno other = (Alumno) obj;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return this.nombre;
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
}
