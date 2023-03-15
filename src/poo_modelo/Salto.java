package poo_modelo;

import java.util.Random;

public class Salto {
	Random random = new Random();
	private int votacionJurado = random.nextInt(10);
	private boolean invalido = random.nextBoolean();
	private Salto saltoMejorPuntuacion;
	private Salto saltoPeorPuntuacion;
	private Salto[] puntuaciones;

	public Salto() {

	}

	public int getVotacionJurado() {
		return votacionJurado;
	}

	public boolean isInvalido() {
		return invalido;
	}

	/**
	 * @return the salto
	 */
	public Salto[] getSalto() {
		return puntuaciones;
	}

	/**
	 * @param salto the salto to set
	 */
	public void setSalto(Salto[] salto) {
		this.puntuaciones = salto;
	}

	public double getMejorPuntuacionSalto() {
		this.saltoMejorPuntuacion = this.puntuaciones[0];
		for (int i = 0; i < puntuaciones.length; i++) {
			if (this.puntuaciones[i].getVotacionJurado() > this.saltoMejorPuntuacion.getVotacionJurado()) {
				this.saltoMejorPuntuacion.votacionJurado = this.puntuaciones[i].votacionJurado;
			}
		}
		return this.saltoMejorPuntuacion.votacionJurado;

	}

	public int getPeorPuntuacionSalto() {
		this.saltoPeorPuntuacion.votacionJurado = this.votacionJurado;
		for (int i = 0; i < puntuaciones.length; i++) {
			if (this.puntuaciones[i].getVotacionJurado() < this.saltoMejorPuntuacion.getVotacionJurado()) {
				this.saltoPeorPuntuacion.votacionJurado = this.puntuaciones[i].votacionJurado;
			}

		}

		return this.saltoPeorPuntuacion.votacionJurado;

	}

	public int puntuacionSaltoIndividual() {
		
		return votacionJurado;

	}
}
