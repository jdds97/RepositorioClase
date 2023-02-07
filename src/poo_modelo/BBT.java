package poo_modelo;

public class BBT extends Bicicleta {
	int alturaSillin;

	/**
	 * @return the alturaSillin
	 */
	public int getAlturaSillin() {
		return alturaSillin;
	}


	/**
	 * @param alturaSillin
	 */
	public BBT(int alturaSillin) {
		
		this.alturaSillin = alturaSillin;
	}


	/**
	 * @param alturaSillin the alturaSillin to set
	 */
	public void setAlturaSillin(int alturaSillin) {
		this.alturaSillin = alturaSillin;
	}

	/**
	 * 
	 */
	public BBT() {
		super();
		

	}


	/**
	 * @param cadencia
	 * @param marcha
	 * @param velocidad
	 * @param alturaSillin
	 */
	public BBT(int cadencia, int marcha, int velocidad, int alturaSillin) {
		super(cadencia, marcha, velocidad);
		this.alturaSillin = alturaSillin;
	}
	

	

}
