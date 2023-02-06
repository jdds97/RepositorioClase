package poo_modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Juego {
	private Mazo mazo;
	private Carta carta;
	ArrayList<Carta> manoJugador;
	ArrayList<Carta> manoRaul;

	public Juego() {
		mazo = new Mazo();
		mazo.barajar();
		manoJugador = new ArrayList<Carta>();
		manoRaul = new ArrayList<Carta>();
	}

	public void jugarRonda() {

		manoJugador.add(mazo.sacarCarta());
		manoRaul.add(mazo.sacarCarta());

		// Imprime las manos de cada jugador
		JOptionPane.showMessageDialog(null, "Mano del jugador: " + manoJugador.toString());
		JOptionPane.showMessageDialog(null, "Mano del ordenador: " + manoRaul.toString());
		// Calcular la puntuación total de cada mano
		double puntuacionJugador = 0;
		for (Carta carta : manoJugador) {
			puntuacionJugador += Math.min(carta.getValor(), 0.5);
		}
		double puntuacionOrdenador = 0;
		for (Carta carta : manoRaul) {
			puntuacionOrdenador += Math.min(carta.getValor(), 0.5);
		}

		// Determinar el ganador
		if (puntuacionJugador > 7.5) {
			JOptionPane.showMessageDialog(null, "El ordenador gana.");
		} else if (puntuacionOrdenador > 7.5) {
			JOptionPane.showMessageDialog(null, "El jugador gana.");
		} else if (puntuacionJugador > puntuacionOrdenador) {
			JOptionPane.showMessageDialog(null, "El jugador gana.");
		} else if (puntuacionOrdenador > puntuacionJugador) {
			JOptionPane.showMessageDialog(null, "El ordenador gana.");
		} else {
			JOptionPane.showMessageDialog(null, "Empate.");
		}
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}
}
