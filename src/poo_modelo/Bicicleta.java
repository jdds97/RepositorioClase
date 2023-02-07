package poo_modelo;

public class Bicicleta {
	int cadencia;
	/**
	 * 
	 */
	public Bicicleta() {
		super();
	}
	/**
	 * @param cadencia
	 * @param marcha
	 * @param velocidad
	 */
	public Bicicleta(int cadencia, int marcha, int velocidad) {
		
		this.cadencia = cadencia;
		this.marcha = marcha;
		this.velocidad = velocidad;
	}
	/**
	 * @return the cadencia
	 */
	protected int getCadencia() {
		return cadencia;
	}
	/**
	 * @param cadencia the cadencia to set
	 */
	protected void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}
	/**
	 * @return the marcha
	 */
	protected int getMarcha() {
		return marcha;
	}
	/**
	 * @param marcha the marcha to set
	 */
	protected void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	/**
	 * @return the velocidad
	 */
	protected int getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	protected void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	int marcha;
	int velocidad;
}
