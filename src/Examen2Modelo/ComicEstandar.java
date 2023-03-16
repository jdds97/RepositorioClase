package Examen2Modelo;



public class ComicEstandar extends ComicClasico {

	private static final double CTE = 1.5;

	/**
	 * @param id
	 * @param titulo
	 * @param fecha
	 * @param genero
	 * @param precio
	 */
	public ComicEstandar() {
		super();
	}

	@Override
	public double constante() {
	
		return CTE;
	}
}
