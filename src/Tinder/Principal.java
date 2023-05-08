package Tinder;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Principal
{
	private Modelo modelo;
	private VentanaPpal vista;

	public static void main(String args[])
	{
		new Principal();
	}

	public Principal()
	{
		this.modelo = new Modelo();

		//////////// usado para crear datos de prueba
		this.crearDatos();
		////////////

		this.vista = new VentanaPpal(this);
		this.vista.setVisible(true);
	}

	private void crearDatos()
	{

		String afiA[]= {"Leer","Ver la tele"};
		String afiB[]= {"Leer","Ir al cine"};
		String afiC[]= {"Leer","Pasear"};
		String afiD[]= {"Leer","Ver la tele","Ir al cine"};
		String afiE[]= {"Leer","Ver la tele","Ir al cine","Pasear"};
		
		altaSolicitante("Ambrosio",Persona.HOMBRE,Persona.MUJER,true, Arrays.asList(afiA));
		altaSolicitante("Amelia",Persona.MUJER,Persona.HOMBRE,false,Arrays.asList(afiB));
		altaSolicitante("Amos",Persona.HOMBRE,Persona.HOMBRE,false,Arrays.asList(afiC));
		altaSolicitante("Amparo",Persona.MUJER,Persona.MUJER,false,Arrays.asList(afiD));
		altaSolicitante("Anacleto",Persona.HOMBRE,Persona.MUJER,true,Arrays.asList(afiE));
		altaSolicitante("Anastasia",Persona.MUJER,Persona.HOMBRE,false,Arrays.asList(afiA));
		altaSolicitante("Andres",Persona.HOMBRE,Persona.HOMBRE,false,Arrays.asList(afiB));
		altaSolicitante("Angel",Persona.HOMBRE,Persona.MUJER,false,Arrays.asList(afiC));
		altaSolicitante("Angela",Persona.MUJER,Persona.HOMBRE,true,Arrays.asList(afiD));
		altaSolicitante("Angeles",Persona.MUJER,Persona.MUJER,false,Arrays.asList(afiE));
		altaSolicitante("Angelica",Persona.MUJER,Persona.HOMBRE,false,Arrays.asList(afiA));
		altaSolicitante("Angelina",Persona.MUJER,Persona.MUJER,false,Arrays.asList(afiB));
		altaSolicitante("Angustias",Persona.MUJER,Persona.HOMBRE,true,Arrays.asList(afiC));
		altaSolicitante("Anibal",Persona.HOMBRE,Persona.MUJER,false,Arrays.asList(afiD));
		altaSolicitante("Aniceto",Persona.HOMBRE,Persona.HOMBRE,false,Arrays.asList(afiE));
		altaSolicitante("Anselmo",Persona.HOMBRE,Persona.MUJER,true,Arrays.asList(afiA));

	}
	

	public int altaSolicitante(String nombre, boolean solicitanteHombre, 
			boolean solicitadoHombre, boolean gestor,
			List<String> aficiones)
	{
		return this.modelo.añadeSolicitante(nombre,solicitanteHombre,
				solicitadoHombre,gestor,aficiones);
	}

	public Set<Persona> getListaGestores()
	{
		return this.modelo.getListaGestores();
	}

	public Set<Persona> getListaSolicitantes()
	{
		return this.modelo.getListaSolicitantes();
	}

	public String getListadoAfinidades(String nombreSolicitante)
	{
		return this.modelo.getListadoAfinidades(nombreSolicitante);
	}

	public int creaPareja(String nombreGestor, String nombreSolicitante, String nombrePareja)
	{
		return this.modelo.creaPareja(nombreGestor, nombreSolicitante, nombrePareja);
	}

	public String getListadoSolicitantes()
	{
		return this.modelo.getListadoSolicitantes();
	}

	public String getListadoParejas()
	{
		return this.modelo.getListadoParejas();
	}
}