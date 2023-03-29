package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import poo_modelo.Persona;

public class Listas {

	public static void main(String[] args) {
		List<Persona> alumnosNuevos=new LinkedList<Persona>();
		ArrayList<Persona>alumnos=new ArrayList<Persona>();
		ArrayList<Persona>alumnosVacia=new ArrayList<Persona>();
		Persona luis=new Persona("Luis",18);
		Persona espe=new Persona("Espe",20);
		Persona dani=new Persona("Dani",15);
		Persona jesus=new Persona("Jesus",16);
		alumnos.add(luis);
		alumnos.add(espe);
		alumnos.add(dani);
		alumnos.add(3,jesus);
		
		
		System.out.println("La longitud de los alumnos es de "+alumnos.size());
		System.out.println("El alumno en la posicion 4 es "+alumnos.get(3));
		System.out.println("La lista de alumnosVacia esta vacía y por eso es igual a "
				+ "="+alumnosVacia.isEmpty());
		System.out.println("Luis esta en la lista de alumnos por lo tanto es igual a ="
				+alumnos.contains(luis));
		alumnos.remove(1);
		System.out.println("Espe ya no  está en la lista" +alumnos);
		System.out.println("Luis está en el indice "+alumnos.indexOf(luis));
		alumnosVacia.addAll(alumnos);
		System.out.println(alumnos);
		for (Persona persona : alumnosVacia) {
			if(persona.ismayorDeEdad())
			System.out.println(persona.getNombre()+" es mayor de edad");
			else
			System.out.println(persona.getNombre()+" es menor de edad");
		}
	//Numeros
		List <Integer> listaNumeros=new LinkedList();
		listaNumeros.add(4);
		listaNumeros.add(1);
		listaNumeros.add(33);
		
		Collections.sort(listaNumeros,Collections.reverseOrder());
		luis.setSalario(1000);
		dani.setSalario(10000);
		jesus.setSalario(220000);
		Collections.sort(alumnosVacia);
		for (Persona persona : alumnosVacia) {
			System.out.println(persona.getNombre()+" "+persona.getSalario());
		}
		System.out.println("");
		Collections.sort(alumnosVacia,Collections.reverseOrder());
		for (Persona persona : alumnosVacia) {
			System.out.println(persona.getNombre()+" "+persona.getSalario());
		}
		luis.setNombre("Alex");
		dani.setNombre("Bernardo");
		jesus.setNombre("Zapatero");
		Collections.sort(alumnosVacia);
		for (Persona persona : alumnosVacia) {
			System.out.println(persona.getNombre()+" ");
		}
		System.out.println("");
		Collections.sort(alumnosVacia,Collections.reverseOrder());
		for (Persona persona : alumnosVacia) {
			System.out.println(persona.getNombre());
			
		}
		Collections.swap(listaNumeros,1, 2);
		System.out.println(alumnosVacia);
		
		
		
	}

}
