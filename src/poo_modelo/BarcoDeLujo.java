package poo_modelo;


public class BarcoDeLujo extends Barco {
	protected int numeroCamarotes;
	public BarcoDeLujo(String matricula, int eslora,String fechaFabricacion,int potenciaCV,int numeroCamarotes) {
        super(matricula, eslora, fechaFabricacion, potenciaCV);
        this.numeroCamarotes=numeroCamarotes;
    }
	/**
	 * @return the numeroCamarotes
	 */
	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}

	
	@Override
	protected int funcionEspecifica() {
		return numeroCamarotes ;
	}

}
