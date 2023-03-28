package Examen2TrimestreModelo;

public class ComicEstandarMal extends ComicClasicoMal  {
	public final static double CTE=0.5;
	/**
	 * @param id
	 * @param titulo
	 * @param fecha
	 * @param genero
	 * @param precio
	 */
	public ComicEstandarMal() {
		super();
	}

	@Override
	public double constante() {
		return 0.5;
	
	}
	
}
