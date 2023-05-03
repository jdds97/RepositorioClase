package ExamenEntornos;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nif);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InquilinoParticulares other = (InquilinoParticulares) obj;
		return Objects.equals(nif, other.nif);
	}

	@Override
	public String toString() {
		return "InquilinoParticulares [nif=" + nif + ", descuento()=" + descuento() + ", getNombreCompleto()="
				+ getNombreCompleto() + "]";
	}
	
	/**
	 * 
	 */

}
