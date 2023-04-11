package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import poo_modelo.Persona;

public class HashSetYHashMap {

	public static void main(String[] args) {
		/**TreeSet <Integer>a=new TreeSet<Integer>();
		a.add(1);
		a.add(20);
		a.add(90);
		a.add(10);
		TreeSet <Integer>b=new TreeSet<Integer>();
		b.add(12);
		b.add(20);
		b.add(90);
		b.add(11);
		a.addAll(b);
		System.out.println(a);
		a.retainAll(b);
		
		System.out.println(a);
		a.remove(b);
		System.out.println(b);
		*/
		
		//Hashmap
		HashMap <String,Persona> alumnos=new HashMap<>();
		Persona sandra=new Persona();
		sandra.setNombre("Sandra");
		Persona linares=new Persona();
		linares.setNombre("Linares");
		alumnos.put(sandra.getNombre(), sandra);
		alumnos.put(linares.getNombre(), linares);
		System.out.println(alumnos);
		System.out.println(alumnos.get("Sandra"));
		System.out.println(alumnos.keySet());
		
		for (String clave : alumnos.keySet()) {
			System.out.println(alumnos.get(clave));
		}
		
		Collection<Persona> nombres=alumnos.values();
		System.out.println(nombres);
		String nombre="Sandra";
		if(alumnos.containsKey(nombre))
			System.out.println("Sandra está en la lista");
	
		alumnos.remove(nombre);
		System.out.println(alumnos);
	}

}
