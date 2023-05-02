package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


import javax.swing.JOptionPane;

import utils.Utils;

public class Ejercicio2HashMap {

	public static void main(String[] args) {
		int correcto = 0;
		int falso = 0;
		Utils hashMap=new Utils();
		HashMap<String, String> miniDiccionario = new HashMap<>();
		miniDiccionario.put("perro", "dog");
		miniDiccionario.put("gato", "cat");
		miniDiccionario.put("libro", "book");
		miniDiccionario.put("casa", "house");
		miniDiccionario.put("coche", "car");
		miniDiccionario.put("manzana", "apple");
		miniDiccionario.put("naranja", "orange");
		miniDiccionario.put("plï¿½tano", "banana");
		miniDiccionario.put("ordenador", "computer");
		miniDiccionario.put("telï¿½fono", "phone");
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
		ArrayList<String> palabras=new ArrayList<String>(miniDiccionario.keySet());
		Collections.shuffle(palabras);
			for(String traduccion:palabras) {
				 String respuesta=hashMap.tryCatchString("Dime la traduccion de "+miniDiccionario.get(traduccion));
				if(respuesta.equals(miniDiccionario.get(traduccion))) {
					correcto++;
				}
				else {
					falso++;
				}
			}
			JOptionPane.showMessageDialog(null, "Palabras correctas"+correcto+" palabras");
			JOptionPane.showMessageDialog(null, "Palabras erróneas"+falso+" palabras");
		}
			
		}
		
	


