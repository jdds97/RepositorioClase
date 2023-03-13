package ExamenModelo;

import java.util.Random;

public class BebidaAzucarada extends Bebida {
	static Random random = new Random();
	protected double porcentajeAzucar = 10 + (20.0 - 10.0) * random.nextDouble();
	protected static int idRefrescos = random.nextInt(1500);
	static Random string = new Random();
	protected static String[] nombresRefrescos = { "CocaCola", "Fanta", "Seven UP" };
	static int indiceAleatorio = string.nextInt(nombresRefrescos.length);
	static String nombreSeleccionado = nombresRefrescos[indiceAleatorio];

	public BebidaAzucarada() {
		super(nombresRefrescos, nombreSeleccionado, idRefrescos, 33, new Marca(nombreSeleccionado));

	}

	/**
	 * @return the porcentajeAzucar
	 */
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

}
