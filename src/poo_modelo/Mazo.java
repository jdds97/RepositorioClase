package poo_modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	ArrayList<Carta> cartas;



	  Mazo() {
	    cartas = new ArrayList<Carta>();

	    // Agrega las cartas al mazo
	    String[] palos = {"espadas", "oros", "copas", "bastos"};
	    for (String palo : palos) {
	      for (int i = 1; i <= 7; i++) {
	        cartas.add(new Carta(i, palo));
	      }
	    }
	  }

	  void barajar() {
	    // Baraja las cartas en el mazo
	    Collections.shuffle(cartas);
	  }

	  Carta sacarCarta() {
	    // Devuelve la primera carta del mazo y la elimina de él
	    Carta carta = cartas.get(0);
	    cartas.remove(0);
	    return carta;
	  }
}
