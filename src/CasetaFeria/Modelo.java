package CasetaFeria;
import java.util.*;

public class Modelo
{
	private ListaPrecios listaPrecios;
	private ListaSocios listaSocios;
	private HashMap<Socio,LinkedList<Consumici�n>> listaCuentas; 

	public Modelo()
	{
		this.listaPrecios = new ListaPrecios();
		this.listaSocios = new ListaSocios();
		this.listaCuentas = new HashMap<Socio,LinkedList<Consumici�n>>();
	}




	public boolean a�adeArt�culo(String nombre,  String tama�o, float precio) 
	{
		if(this.listaPrecios.put(new Art�culo(nombre,tama�o),precio)==null)
			return true;
		else
			return false;
	}

	public boolean borraArt�culo(String nombre, String tama�o) 
	{
		if(this.listaPrecios.remove(new Art�culo(nombre,tama�o))==null)
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

	public boolean hayCuentaPendienteConEseArticulo(String art, String tama�o) 
	{
		for(Socio s:this.listaCuentas.keySet())
			for(Consumici�n c:this.listaCuentas.get(s))
				if(c.getArt�culo().equals(new Art�culo(art,tama�o)))
					return true;

		return false;

	}

	public void a�adeConsumici�n(Socio socio, Art�culo art�culo, int cantidad) 
	{
		if(!this.listaCuentas.containsKey(socio))
			this.listaCuentas.put(socio, new LinkedList<Consumici�n>());

		this.listaCuentas.get(socio).add(new Consumici�n(art�culo, cantidad));	
	}

	public LinkedList<Consumici�n> getListaConsumiciones(Socio socio) 
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
			for(Consumici�n c:this.listaCuentas.get(socio))
			{
				res+=c.toString()+" x "+this.listaPrecios.get(c.getArt�culo())+" = "+c.getCantidad()*this.listaPrecios.get(c.getArt�culo())+"\n";
				total+=c.getCantidad()*this.listaPrecios.get(c.getArt�culo());
			}
			res+="\nTOTAL...........:"+total;
		}
		return res;
	}


}
