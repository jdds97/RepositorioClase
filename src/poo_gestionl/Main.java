package poo_gestionl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import poo_modelo.Cuenta;
import poo_modelo.Persona;
import poo_modelo.Saltador;

public class Main {

	public static void main(String[] args) {
		
		/*int numeroLitros;

		Cubo cuboPorDefecto=new Cubo();
		Cubo cuboConParametro=new Cubo("pl�stico", false, "negro", 10, 0);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres llenar?"));
		cuboPorDefecto.llenarCubo(numeroLitros);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres vaciar?"));
		cuboPorDefecto.vaciarCubo(numeroLitros);
		cuboPorDefecto.setCapacidadActual(numeroLitros);
		cuboPorDefecto.pintarCubo(numeroLitros);
		cuboPorDefecto.mostrarCuboPintado(cuboPorDefecto.pintarCubo);
		JOptionPane.showMessageDialog(null, cuboConParametro);
		JOptionPane.showMessageDialog(null, "Hola me llamo "+pernombre);
		Cuadrado uno=new Cuadrado();
		uno.pintarCuadrado(5);*/
		/**
		 * Persona jesus=new Persona(" Jesus","de dios Sanchez",LocalDate.parse("03-08-1997"),'M');
		 
		jesus.saludar();
		JOptionPane.showMessageDialog(null, "Jesus tiene como sexo "+jesus.getSexo());
		Cuenta jesusito=new Cuenta("0000", 0.5,123456789,1200);
		JOptionPane.showMessageDialog(null, "El saldo de jesusito es "+jesusito.getSaldo());
		Cuenta alberto=new Cuenta("0000",0.8,123456781,12);
		jesusito.hacerTransferenciaA(alberto, 500);
		JOptionPane.showMessageDialog(null, "El saldo de jesusito es ahora de "+jesusito.getSaldo()+" y el de Alberto "+alberto.getSaldo());
		*/
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
		TreeSet <Integer>a=new TreeSet<Integer>();
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
		
		
		
	}

}
