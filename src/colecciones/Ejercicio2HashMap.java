package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import utils.Utils;

public class Ejercicio2HashMap {

	public static void main(String[] args) {
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
		miniDiccionario.put("plátano", "banana");
		miniDiccionario.put("ordenador", "computer");
		miniDiccionario.put("teléfono", "phone");
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
		}
		
	}

}
