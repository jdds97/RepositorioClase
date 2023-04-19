package colecciones;

import java.util.ArrayList;

import Examen2Modelo.Utils;
import poo_modelo.Persona;

public class Ejercicio1 {
	/**
	 * Crea un ArrayList con los nombres de 6 compañeros de clase que se introduzcan
	 * por consola. A continuación, muestra esos nombres por pantalla. Utiliza para
	 * ello un bucle for (for-each) que recorra todo el ArrayList. Imprimir la misma
	 * lista también en orden inverso
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Utils utilsCompanieros = new Utils();
		ArrayList<Persona> companieros = new ArrayList<Persona>();

		String pregunta = "¿Cual es el nombre?";

		for (int i = 0; i < 6; i++) {
			Persona p = new Persona();
			companieros.add(p);
			p.setNombre(utilsCompanieros.tryCatchString(pregunta));
		}

		for (Persona persona : companieros) {
			System.out.println(persona.getNombre());
		}

		
	}
}
