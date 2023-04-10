package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos el numero aleatorio
		Random rand = new Random();
		int numeroAleatorioArray =10 + rand.nextInt(11);
		//Creamos la lista con un numero aleatorio 
		ArrayList<Integer> numerosAleatorios = new ArrayList<>(numeroAleatorioArray);
		//Recorremos la array con el número aleatorio que hemos pasado
		//al no tener valores añadidos la longitud del array está vacía 
		for (int i=0;i<numeroAleatorioArray;i++) {
			//Añadimos por cada iteracción del numero aleatorio un número aleatorio
			//entre 0 y 100
			numerosAleatorios.add(rand.nextInt(100));
		}
		//Mostramos por pantalla los numeros aleatorios creados en la lista
		System.out.println(numerosAleatorios);
	}

}
