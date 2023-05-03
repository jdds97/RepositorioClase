package ExamenEntornos;

import java.util.Objects;

public class InquilinoEmpresa extends Inquilino {
	private String cif;
	public InquilinoEmpresa(String nombreCompleto, String cif) {
		super(nombreCompleto);
	this.cif=cif;
	}
	
	@Override
	public double descuento() {
		return 0.1;
	}

	public String getCif() {
		return cif;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cif);
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
		InquilinoEmpresa other = (InquilinoEmpresa) obj;
		return Objects.equals(cif, other.cif);
	}

	@Override
	public String toString() {
		return "InquilinoEmpresa [cif=" + cif + ", descuento()=" + descuento() + ", getNombreCompleto()="
				+ getNombreCompleto() + "]";
	}
	
}
