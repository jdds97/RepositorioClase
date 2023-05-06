
public class Comercial
{
	private String nombre;
	private float ventas;
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public float getVentas()
	{
		return ventas;
	}
	public void setVentas(float ventas)
	{
		this.ventas = ventas;
	}
	public Comercial(String nombre, float ventas)
	{
		super();
		this.nombre = nombre;
		this.ventas = ventas;
	}

	@Override
	public String toString()
	{
		return nombre;
	}
}
