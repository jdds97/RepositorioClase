package ExamenEntornos;

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
	
}
