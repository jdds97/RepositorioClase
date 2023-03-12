package ExamenModelo;

public class Agua extends Bebida {

	private String nombreManantial;
	
	public Agua(int id, int cantidad, double precioBase, double precioFinal,String nombreManantial,Marca marca) {
		super(id, cantidad, precioBase, precioFinal,marca);
		
		this.nombreManantial=nombreManantial;
	}
	/**
	 * @return the nombreManantial
	 */
	public String getNombreManantial() {
		return nombreManantial;
	}

}
