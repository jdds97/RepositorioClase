package ExamenModelo;

import java.util.Random;

public class BebidaAzucarada extends Bebida {
	static Random random = new Random();
	private double porcentajeAzucar = random.nextDouble() * 100 + 1;

	public BebidaAzucarada(int id, int cantidad, double precioBase, double precioFinal, int porcentajeAzucar,
			Marca marca) {
		super(id, cantidad, 0 + (4.0 - 0.0) * random.nextDouble(), precioFinal, marca);
		this.porcentajeAzucar = porcentajeAzucar;
	}

	/**
	 * @return the porcentajeAzucar
	 */
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

}
