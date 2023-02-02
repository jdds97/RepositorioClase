package poo_modelo;

import java.util.ArrayList;

import poo_modelo.Mazo;

public class Juego {
	Mazo mazo;
	  ArrayList<Carta> manoJugador;
	  ArrayList<Carta> manoOrdenador;

	  Juego() {
	    mazo = new Mazo();
	    mazo.barajar();
	    manoJugador = new ArrayList<Carta>();
	    manoOrdenador = new ArrayList<Carta>();
	  }

	  void jugarRonda() {
	    // Reparte dos cartas a cada jugador
	    manoJugador.add(mazo.sacarCarta());
	    manoJugador.add(mazo.sacarCarta());
	    manoOrdenador.add(mazo.sacarCarta());
	    manoOrdenador.add(mazo.sacarCarta());

	    // Imprime las manos de cada jugador
	    System.out.println("Mano del jugador: " + manoJugador);
	    System.out.println("Mano del ordenador: " + manoOrdenador);
	 // Calcular la puntuación total de cada mano
	    double puntuacionJugador = 0;
	    for (Carta carta : manoJugador) {
	      puntuacionJugador += Math.min(carta.valor, 0.5);
	    }
	    double puntuacionOrdenador = 0;
	    for (Carta carta : manoOrdenador) {
	      puntuacionOrdenador += Math.min(carta.valor, 0.5);
	    }

	    // Determinar el ganador
	    if (puntuacionJugador > 7.5) {
	      System.out.println("El ordenador gana.");
	    } else if (puntuacionOrdenador > 7.5) {
	      System.out.println("El jugador gana.");
	    } else if (puntuacionJugador > puntuacionOrdenador) {
	      System.out.println("El jugador gana.");
	    } else if (puntuacionOrdenador > puntuacionJugador) {
	      System.out.println("El ordenador gana.");
	    } else {
	      System.out.println("Empate.");
	    }
	}
}


