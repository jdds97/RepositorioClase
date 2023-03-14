package poo_modelo;

public class InquilinoEmpresa extends Inquilino {
	
	public InquilinoEmpresa(String nombreCompleto, String doc1) {
		super(nombreCompleto, doc1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double descuento() {
		return 0.1;
	}
	
}
