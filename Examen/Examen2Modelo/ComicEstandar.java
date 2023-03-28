package Examen2Modelo;


/**
 * Clase hija de ComicClasico que no tiene datos añadidos del ComicClasico excepto la constante
 * 
 * @author Jesus de Dios 
 *
 */
public class ComicEstandar extends ComicClasico {
	//Constante que se va sobreescribir en el metodo abstracto
	private static final double CTE = 1.5;

	public ComicEstandar() {
		super();
	}

	@Override
	public double constante() {
	
		return CTE;
	}

	@Override
	public void setITQ(int americanITQ) {
	}
}
