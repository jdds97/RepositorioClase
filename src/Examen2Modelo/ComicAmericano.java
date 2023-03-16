package Examen2Modelo;


public class ComicAmericano extends ComicClasico {
	private int americanITQ;
	private final static double CTE_USA=1.75;
	public ComicAmericano() {
		
		
	}

	public int getAmericanITQ() {
		return americanITQ;
	}

	public int setAmericanITQ(int americanITQ) {
		return this.americanITQ = americanITQ;
	}
	@Override
	public String toString() {
		return "-Identificador=" + this.getIdComic() + "\n "
				+ (getTitulo() != null ? "Titulo:" + getTitulo() + "\n " : "") + (getFecha() != null ? "Fecha:" + getFecha() + ", " : "")
				+ (getGenero() != null ? "Genero:" + getGenero() + "\n " : "") + "Precio:" + getPrecio() + "\n "
				+ (americanITQ != 0 ? "American ITQ :" + americanITQ : "") ;
	}
	@Override
	public double constante() {
		return CTE_USA;
	}
}
