package ExamenEntornos;

import java.util.Objects;

public abstract class Inquilino {
	private String nombreCompleto;
	
	/*
	 * Constructor de Inquilino
	 */
	protected Inquilino(String nombreCompleto) {

		this.nombreCompleto = nombreCompleto;
	}

	/*
	 * Getters y setters de Inquilino
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	abstract double descuento();

	@Override
	public int hashCode() {
		return Objects.hash(nombreCompleto);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inquilino other = (Inquilino) obj;
		return Objects.equals(nombreCompleto, other.nombreCompleto);
	}

	@Override
	public String toString() {
		return "Inquilino [" + (nombreCompleto != null ? "nombreCompleto=" + nombreCompleto : "") + "]";
	}
}
