package CasetaFeria;
import java.util.*;

public class Modelo
{
	private ListaPrecios listaPrecios;
	private ListaSocios listaSocios;
	private HashMap<Socio,LinkedList<Consumición>> listaCuentas; 

	public Modelo()
	{
		this.listaPrecios = new ListaPrecios();
		this.listaSocios = new ListaSocios();
		this.listaCuentas = new HashMap<Socio,LinkedList<Consumición>>();
	}




	public boolean añadeArtículo(String nombre,  String tamaño, float precio) 
	{
		if(this.listaPrecios.put(new Artículo(nombre,tamaño),precio)==null)
			return true;
		else
			return false;
	}

	public boolean borraArtículo(String nombre, String tamaño) 
	{
		if(this.listaPrecios.remove(new Artículo(nombre,tamaño))==null)
			return false;
		else
			return true;
	}

	public  ListaSocios getListaSocios() 
	{
		return this.listaSocios;
	}

	public ListaPrecios getListaPrecios() 
	{
		return listaPrecios;
	}

	public boolean hayCuentaPendienteConEseArticulo(String art, String tamaño) 
	{
		for(Socio s:this.listaCuentas.keySet())
			for(Consumición c:this.listaCuentas.get(s))
				if(c.getArtículo().equals(new Artículo(art,tamaño)))
					return true;

		return false;

	}

	public void añadeConsumición(Socio socio, Artículo artículo, int cantidad) 
	{
		if(!this.listaCuentas.containsKey(socio))
			this.listaCuentas.put(socio, new LinkedList<Consumición>());

		this.listaCuentas.get(socio).add(new Consumición(artículo, cantidad));	
	}

	public LinkedList<Consumición> getListaConsumiciones(Socio socio) 
	{
		return this.listaCuentas.get(socio);
	}

	public String calculaTotalCuenta(Socio socio) 
	{
		String res="";
		float total =0.0F;
		if(this.listaCuentas.get(socio)!=null)
		{
			res+=socio+"\n";
			for(Consumición c:this.listaCuentas.get(socio))
			{
				res+=c.toString()+" x "+this.listaPrecios.get(c.getArtículo())+" = "+c.getCantidad()*this.listaPrecios.get(c.getArtículo())+"\n";
				total+=c.getCantidad()*this.listaPrecios.get(c.getArtículo());
			}
			res+="\nTOTAL...........:"+total;
		}
		return res;
	}


}
