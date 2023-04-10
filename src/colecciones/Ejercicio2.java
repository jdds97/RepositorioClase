package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		//Creamos el numero aleatorio
		Random rand = new Random();
		int suma=0;
		int media=0;
		int numeroAleatorioArray =10 + rand.nextInt(11);
		//Creamos la lista con un numero aleatorio 
		ArrayList<Integer> numerosAleatorios = new ArrayList<>(numeroAleatorioArray);
		//Recorremos la array con el n�mero aleatorio que hemos pasado 	
		//al no tener valores a�adidos la longitud del array est� vac�a 
		for (int i=0;i<numeroAleatorioArray;i++) {
			
			suma+=numerosAleatorios.get(i);
			//A�adimos por cada iteracci�n del numero aleatorio un n�mero aleatorio
			//entre 0 y 100
			numerosAleatorios.add(rand.nextInt(100));
		}
		media=suma/numerosAleatorios.size();
		//Mostramos por pantalla los numeros aleatorios creados en la lista
		System.out.println(numerosAleatorios);
		System.out.println("La suma de todos es "+suma);
		System.out.println("El tamaño es de "+numerosAleatorios.size());
		System.out.println("La media de los numeros es "+media);
		System.out.println("El máximo de los números es "+Math.pow(media, numeroAleatorioArray));
	}

}
