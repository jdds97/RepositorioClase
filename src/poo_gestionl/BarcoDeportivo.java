package poo_gestionl;

import poo_modelo.Barco;

public class BarcoDeportivo extends Barco{

	public BarcoDeportivo(String matricula, int eslora, String fechaFabricacion, int potenciaCV) {
		super(matricula, eslora, fechaFabricacion, potenciaCV);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int funcionEspecifica() {
		return this.potenciaCV;
	}
	

}
