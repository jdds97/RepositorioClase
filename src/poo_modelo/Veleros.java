package poo_modelo;

public class Veleros extends Barco {
	protected int mastilesVeleros;

	public Veleros(String matricula, int eslora, String fechaFabricacion, int potenciaCV, int mástilesVeleros) {
		super(matricula, eslora, fechaFabricacion, potenciaCV);
		this.mastilesVeleros = mástilesVeleros;
	}

	/**
	 * @return the mastilesVeleros
	 */
	public int getMastilesVeleros() {
		return mastilesVeleros;
	}

	@Override
	protected int funcionEspecifica() {
		// TODO Auto-generated method stub
		return mastilesVeleros;
	}
}
