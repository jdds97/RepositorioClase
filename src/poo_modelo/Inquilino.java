package poo_modelo;

import java.util.Objects;

public abstract class Inquilino {
	protected String nombreCompleto;
	protected String doc;

	/*
	 * Constructor de Inquilino
	 */
	public Inquilino(String nombreCompleto, String doc1) {

		this.nombreCompleto = nombreCompleto;
		this.doc = doc1;
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
		return Objects.equals(doc, other.doc);
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

	public String getDOC() {
		return doc;
	}

	public abstract double descuento();

}
