package ExamenEntornos;

public class InquilinoParticulares extends Inquilino {
	private String nif;

	public InquilinoParticulares(String nombreCompleto, String nif) {
		super(nombreCompleto);
		this.nif = nif;
	}

	@Override
	public double descuento() {

		return 0;
	}

	public String getNif() {
		return nif;
	}

	/**
	 * 
	 */

}
