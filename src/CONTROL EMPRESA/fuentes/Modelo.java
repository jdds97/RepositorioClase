import java.util.*;

public class Modelo
{
	private HashMap<Comercial, TreeSet<Empresa>> asignaciones;
	private Vector<Visita> visitas;

	public Modelo()
	{
		this.asignaciones = new HashMap<Comercial,TreeSet<Empresa>>();
		this.visitas = new Vector<Visita>();
	}

	public void a�adeComercial(Comercial c)
	{
		// a�ade al mapa de asignaciones una nueva pareja con el comercial pasado como 
		// par�metro y un conjunto nuevo vac�o de empresas asignadas.
	}

	public void asignaEmpresaAComercial(Comercial c, Empresa e)
	{
		// asigna la empresa pasada como par�metro al conjunto de empresas que tiene asignadas
		// el comercial pasado como par�metro.
	}

	public void a�adeVisita(Visita visita)
	{
		this.visitas.add(visita);
	}

	public boolean hayErrores()
	{
		// Devuelve true si hay alguna visita hecha por un comercial a una empresa que NO estaba
		// asignada a ese comercial. Devuelve false en otro caso.
	}

	public float totalComprasPorComercial(Comercial c)
	{
		// Devuelve el total de compras hechas por las empresas asignadas al comercial
		// pasado como par�metro.
	}

	public float totalVentasPorEmpresa(Empresa e)
	{
		// Devuelve el total de ventas hechas por todos los comerciales asignados a 
		// la empresa pasada como par�metro.
	}


	public TreeSet<Comercial> comercialesQueVisitaronEnElMes(int mes)
	{
		// Devuelve un TreeSet con todos los comerciales que hicieron alguna visita 
		// en el mes pasado como par�metro.
	}

	public TreeSet<String> nombresDeEmpresasNoVisitadas()
	{
		// Devuelve un TreeSet con todas las empresas que no han recibido ninguna visita.
	}


	public TreeMap<Comercial, LinkedList<Visita>> mapaVisitasPorComercial()
	{
		// Devuelve un mapa con todos los comerciales como claves, y el valor asociado a 
		// cada comercial es una LinkedList de las visitas que ha hecho ese comercial.
	}

}
