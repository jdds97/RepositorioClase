package Examen2TrimestreModelo;




public class ComicAmericanoMal extends ComicClasico {
	private int americanITQ;

	public ComicAmericanoMal() {
		super();
		
	}

	public int getAmericanITQ() {
		return americanITQ;
	}

	public int setAmericanITQ(int americanITQ) {
		return this.americanITQ = americanITQ;
	}
	@Override
	public String toString() {
		return "-Identificador=" + getIdRelevanciaMayor() + "\n "
				+ (getTitulo() != null ? "Titulo:" + getTitulo() + "\n " : "") + (getFecha() != null ? "Fecha:" + getFecha() + ", " : "")
				+ (getGenero() != null ? "Genero:" + getGenero() + "\n " : "") + "Precio:" + getPrecio() + "\n "
				+ (americanITQ != 0 ? "American ITQ :" + americanITQ : "") ;
	}
	@Override
	public void constante() {
		
	}
}
