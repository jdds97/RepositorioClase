package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
	Random rand=new Random();
	int numeroAleatorio1=rand.nextInt(100);
	int numeroAleatorio2=rand.nextInt(100);
	ArrayList<Integer> numeroAleatorios=new ArrayList<Integer>();
	numeroAleatorios.add(numeroAleatorio1);
	numeroAleatorios.addAll(numeroAleatorio2);
	System.out.println(numeroAleatorios);
	}
	
}
