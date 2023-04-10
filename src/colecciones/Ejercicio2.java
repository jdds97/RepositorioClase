package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int numeroAleatorioArray = 20;

		ArrayList<Integer> numerosAleatorios = new ArrayList<>(numeroAleatorioArray);

		for (int i=0;i<numerosAleatorios.size();i++) {
			int numero=rand.nextInt(100);
			numerosAleatorios.add(numero);
		}
		System.out.println(numerosAleatorios.size());
	}

}
