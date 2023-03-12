package ExamenModelo;

public class BebidaAzucarada extends Bebida {
	private int porcentajeAzucar;
	public BebidaAzucarada(int id, int cantidad, double precioBase, double precioFinal,int porcentajeAzucar,Marca marca) {
		super(id, cantidad, precioBase, precioFinal,marca);
		this.porcentajeAzucar=porcentajeAzucar;
	}
	/**
	 * @return the porcentajeAzucar
	 */
	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

}
