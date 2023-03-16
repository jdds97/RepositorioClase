package Examen2Modelo;
/**
 *  * Clase hija de ComicClasico que tiene datos añadidos como la constante CTE_USA y  el ITQ 

 * @author Jesus de Dios
 *
 */

public class ComicAmericano extends ComicClasico {
	protected int americanITQ;
	private final static double CTE_USA=1.75;
	public ComicAmericano() {
		
		
	}

	public int getAmericanITQ() {
		return americanITQ;
	}

	public  void setAmericanITQ(int americanITQa) {
		this.americanITQ = americanITQa;
	}
	
	@Override
	public String toString() {
		return ">Identificador : " + getIdComic() + "\n" +">Titulo : " + getTitulo() + "\n" +">SubTitulo : " + getSubTitulo() + "\n" +">Fecha : "
				+ getFecha() + "\n" +">Precio : " + getPrecio() + "\n" +">Genero : " + getGenero() + "\n" +">American ITB : " + getAmericanITQ();
	}
	@Override
	public double constante() {
		return CTE_USA;
	}

	@Override
	public void setITQ(int americanITQ) {
		this.americanITQ=americanITQ;
	}
}
