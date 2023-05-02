package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import poo_modelo.Carta2;

public class Ejercicio6 {
	/*
	 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
	 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
	 * almacenarlas, y asegúrate de que no se repite ninguna.
	 */
	public static void main(String[] args) {
		ArrayList<Carta2> cartas = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			boolean salir;
			do {
				Carta2 carta = new Carta2();
				if (!cartas.contains(carta)) {
					cartas.add(carta);
					salir = true;
				} else {
					salir = false;
				}
			} while (!salir);
		}
		List<Carta2>listas=cartas;
		Collections.sort(listas);
		System.out.println(cartas);
	}
}
