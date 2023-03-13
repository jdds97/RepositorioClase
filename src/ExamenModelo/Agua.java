package ExamenModelo;

import java.util.Objects;
import java.util.Random;

public class Agua extends Bebida {

	private String nombreManantial;
	static Random random = new Random();
	protected static String[] nombresAgua = { "Lanjaron", "Fontvella", "Solan de Cabras" };
	boolean sonIguales;
	static int indiceAleatorio = random.nextInt(nombresAgua.length);
	static String nombreSeleccionado = nombresAgua[indiceAleatorio];

	public Agua() {
		super(nombresAgua, nombreSeleccionado, 100, indiceAleatorio, new Marca(nombreSeleccionado));

		this.nombreManantial = nombreSeleccionado;
	}

	/**
	 * @return the nombreManantial
	 */
	public String getNombreManantial() {
		return nombreManantial;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombreManantial, sonIguales);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agua other = (Agua) obj;
		return Objects.equals(nombreManantial, other.nombreManantial) && sonIguales == other.sonIguales;
	}
}
