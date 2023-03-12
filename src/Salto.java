import java.util.Random;

public class Salto {
	protected int puntuacion = (int) (Math.random() * 10 + 1);
	protected static boolean valido = true;
	protected static int numeroAleatorio;
	protected static int umbral = 85;
	protected static Random random = new Random();

	public static boolean probabilidadValido() {
		numeroAleatorio = random.nextInt(101);
		if (numeroAleatorio < umbral) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;

	}

	public Salto(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}
