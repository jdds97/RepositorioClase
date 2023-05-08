package CasetaFeria;
import java.util.LinkedList;

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
		this.vista = new VentanaPpal(this);
		this.vista.setVisible(true);
		
		
		////CREACION DE LOS DATOS DE PRUEBA
		
		modelo.getListaSocios().add(new Socio("�lvarez Caballero, Fernando Javier",0));
		modelo.getListaSocios().add(new Socio("Berenguer Borrego, Fernando",0));
		modelo.getListaSocios().add(new Socio("Cabanillas G�lvez, Ezequiel",0));
		modelo.getListaSocios().add(new Socio("Campano Laborda, Jos� Antonio",0));
		modelo.getListaSocios().add(new Socio("Carmona Montiel, Miguel",0));
		modelo.getListaSocios().add(new Socio("Casta�eda Casta�o, Alejandro ",0));
		modelo.getListaSocios().add(new Socio("Cervilla Campoy, Sergio",0));
		modelo.getListaSocios().add(new Socio("De la Fuente Campa�a, Antonio",0));
		modelo.getListaSocios().add(new Socio("Dom�nguez Berm�dez, Marina Pilar",0));
		modelo.getListaSocios().add(new Socio("Dom�nguez Gonz�lez, Adri�n",0));
		modelo.getListaSocios().add(new Socio("Garc�a Alves, Diego",0));
		modelo.getListaSocios().add(new Socio("Garc�a Moreno, Jos� Mar�a",0));
		modelo.getListaSocios().add(new Socio("Garrido Hern�ndez, Juan Manuel",0));
		modelo.getListaSocios().add(new Socio("Garrocho Prados, Manuel",0));
		modelo.getListaSocios().add(new Socio("Hernando Ortega, Iv�n",0));
		modelo.getListaSocios().add(new Socio("Herrera Pozas, David",0));
		modelo.getListaSocios().add(new Socio("Iglesias Garc�a, Javier Manuel",0));
		modelo.getListaSocios().add(new Socio("Mall�n Rodr�guez, Juan",0));
		modelo.getListaSocios().add(new Socio("Menacho Pantoja, Fernando David",0));
		modelo.getListaSocios().add(new Socio("N��ez Toc�n, Alejandro",0));
		modelo.getListaSocios().add(new Socio("Ocampos Buend�a, David",0));
		modelo.getListaSocios().add(new Socio("P�rez Vilches, Luis",0));
		modelo.getListaSocios().add(new Socio("Rodr�guez Mart�nez, Juan Antonio",0));
		modelo.getListaSocios().add(new Socio("S�nchez Verdugo, �lvaro",0));
		modelo.getListaSocios().add(new Socio("Serrano Garc�a, Valme Mar�a",0));
		
		modelo.a�adeArt�culo("Coca Cola","Grande",1.2F);
		modelo.a�adeArt�culo("Coca Cola","Mediano",1.0F);
		modelo.a�adeArt�culo("Coca Cola","Peque�o",0.9F);
		modelo.a�adeArt�culo("Manzanilla","Mediano",4.2F);
		modelo.a�adeArt�culo("Tortilla","Grande",4.2F);
		modelo.a�adeArt�culo("Jam�n","Mediano",9.0F);
		modelo.a�adeArt�culo("Jam�n","Grande",10.2F);
		modelo.a�adeArt�culo("Jam�n","Peque�o",6.5F);
		modelo.a�adeArt�culo("Rebujito","Grande",12.0F);
		
		this.vista.actualizaComboSocios();
		this.vista.actualizaComboArt�culos();
		
		/// FIN DE LA CREACION DE DATOS DE PRUEBA
	}

	public boolean a�adeArt�culo(String nombre, float precio, String tama�o) 
	{
		return this.modelo.a�adeArt�culo(nombre,tama�o,precio);
	}

	public boolean borraArt�culo(String nombre, String tama�o) 
	{
		return this.modelo.borraArt�culo(nombre,tama�o);
	}

	public ListaSocios getListaSocios() 
	{
		return this.modelo.getListaSocios();
	}

	public ListaPrecios getListaPrecios() 
	{
		return this.modelo.getListaPrecios();
	}

	public boolean hayCuentaPendienteConEseArticulo(String art,String tama�o) 
	{
		return this.modelo.hayCuentaPendienteConEseArticulo(art,tama�o);
	}

	public void a�adeConsumici�n(Socio socio, Art�culo art�culo,int cantidad) 
	{
		this.modelo.a�adeConsumici�n(socio, art�culo, cantidad);
	}

	public LinkedList<Consumici�n> getListaConsumiciones(Socio socio) 
	{
		return this.modelo.getListaConsumiciones( socio);
	}

	public String calculaTotal(Socio socio) 
	{
		return this.modelo.calculaTotalCuenta(socio);
	}

	

}
