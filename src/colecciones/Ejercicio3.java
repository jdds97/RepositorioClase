package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ejercicio3 {
	/**
	 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
	 * almacenados en un objeto de la clase ArrayList.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creamos la lista con 10 posiciones
		ArrayList<Integer> diezNumeros = new ArrayList<>();
		// Recorremos la array que hemos pasado
		// al no tener valores a�adidos la longitud del array est� vac�a
		for (int i = 0; i < 10; i++) {
			// A�adimos por cada iteraccion del numero que queramos por entrada
			diezNumeros.add(Integer.parseInt(JOptionPane.showInputDialog("Dime el numero")));
		}
		// Ordenamos la lista
		Collections.sort(diezNumeros);
		// Mostramos por pantalla los numeros ya ordenados creados en la lista
		System.out.println(diezNumeros);
	}

}
