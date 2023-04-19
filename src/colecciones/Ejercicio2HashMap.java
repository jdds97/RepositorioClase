package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio2HashMap {

	public static void main(String[] args) {
		int correcto = 0;
		int falso = 0;
		Random rnd=new Random();
		Utils hashMap=new Utils();
		HashMap<String, String> miniDiccionario = new HashMap<>();
		miniDiccionario.put("perro", "dog");
		miniDiccionario.put("gato", "cat");
		miniDiccionario.put("libro", "book");
		miniDiccionario.put("casa", "house");
		miniDiccionario.put("coche", "car");
		miniDiccionario.put("manzana", "apple");
		miniDiccionario.put("naranja", "orange");
		miniDiccionario.put("pl�tano", "banana");
		miniDiccionario.put("ordenador", "computer");
		miniDiccionario.put("tel�fono", "phone");
		miniDiccionario.put("reloj", "watch");
		miniDiccionario.put("comida", "food");
		miniDiccionario.put("agua", "water");
		miniDiccionario.put("aire", "air");
		miniDiccionario.put("fuego", "fire");
		miniDiccionario.put("tierra", "earth");
		miniDiccionario.put("sol", "sun");
		miniDiccionario.put("luna", "moon");
		miniDiccionario.put("estrella", "star");
		miniDiccionario.put("nube", "cloud");
		ArrayList<String> palabras=new ArrayList<String>();
		for (String diccionario : miniDiccionario.keySet()) {
			palabras.add(diccionario);
			for(String traduccion:palabras) {
				traduccion=hashMap.tryCatchString("Dime la traduccion de "+miniDiccionario.get(diccionario));
				if(traduccion.equals(miniDiccionario.keySet())) {
					correcto++;
				}
				else {
					falso++;
				}
			}
		}
			
		}
		
	}


