package CasetaFeria;
public class Socio
{
	private String nombre;
	private int antigüedad;

	public Socio(String nombre, int antigüedad)
	{
		this.nombre = nombre;
		this.antigüedad = antigüedad;
	}

	public String toString()
	{
		return this.nombre;
	}


}
