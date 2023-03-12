import java.util.Arrays;

public class Saltador extends Persona {
	private Entrenador entrenador;
	private double totalPuntosCompeticion;
	protected Salto[] salto = new Salto[5];
	protected Salto[] saltosValidos;
	protected static boolean iguales = false;

	public Salto[] getSaltosValidos() {
		Arrays.sort(salto);

		for (int i = 0; i < this.salto.length; i++) {
			for (int j = 0; i < this.salto.length; j++) {
				if (salto[i].valido && salto[i].puntuacion > salto[0].puntuacion
						&& salto[i].puntuacion < salto[5].puntuacion)
					saltosValidos[j] = salto[i];
				totalPuntosCompeticion += saltosValidos[j].puntuacion;
			}

		}
		return saltosValidos;
	}

	public void setSalto(Salto[] salto) {
		this.salto = salto;
	}

	public Saltador(String nombre, String apellidos, Nacionalidades nacionalidades, Entrenador entrenador) {
		super(nombre, apellidos, nacionalidades);
		this.entrenador = entrenador;

	}

	public boolean equals(Object otroSaltador) {
		if (this.equals(otroSaltador))
			iguales = true;
		else {
			iguales = false;
		}
		return iguales;
	}

	/**
	 * @return the entrenador
	 */
	public Entrenador getEntrenador() {
		return entrenador;
	}

	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	/**
	 * @return the totalPuntosCompeticion
	 */
	public double getTotalPuntosCompeticion() {
		this.totalPuntosCompeticion = totalPuntosCompeticion / saltosValidos.length;

		return totalPuntosCompeticion;
	}

	/**
	 * @param totalPuntosCompeticion the totalPuntosCompeticion to set
	 */
	public void setTotalPuntosCompeticion(double totalPuntosCompeticion) {
		this.totalPuntosCompeticion = totalPuntosCompeticion;
	}

}
