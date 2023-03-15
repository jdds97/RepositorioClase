package poo_modelo;

public class Entrenador {
	private int numeroCol;
	private Nacionalidad nacionalidad;
	public Entrenador(int numeroCol,Nacionalidad nacionalidad) {
		this.numeroCol = numeroCol;
		this.setNacionalidad(nacionalidad);
	}

	public int getNumeroCol() {
		return numeroCol;
	}

	public void setNumeroCol(int numeroCol) {
		this.numeroCol = numeroCol;
	}

	/**
	 * @return the nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
