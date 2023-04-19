package colecciones;

import java.util.HashMap;

import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio1HashMap {
	
	public static void main(String[] args) {
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
		JOptionPane.showMessageDialog(null, "La traduccion de la palabra es "+miniDiccionario.get(hashMap.tryCatchString("Dime la palabra en español")));
		
	}

}
