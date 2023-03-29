package colecciones;
import java.util.ArrayList;
import Examen2Modelo.Utils;
import poo_modelo.Persona;
public class Ejercicio1 {

public static void main(String[] args) {
	Utils utilsCompanieros=new Utils();
	ArrayList <Persona> companieros = new ArrayList<Persona>();
	Persona persona1= new Persona();
	Persona persona2= new Persona();
	Persona persona3= new Persona();
	Persona persona4= new Persona();
	Persona persona5= new Persona();
	Persona persona6= new Persona();
	String pregunta="¿Cual es el nombre?";
	utilsCompanieros.tryCatchString(pregunta);
	persona1.setNombre(utilsCompanieros.tryCatchString(pregunta));
	persona2.setNombre(utilsCompanieros.tryCatchString(pregunta));
	persona3.setNombre(utilsCompanieros.tryCatchString(pregunta));
	persona4.setNombre(utilsCompanieros.tryCatchString(pregunta));
	persona5.setNombre(utilsCompanieros.tryCatchString(pregunta));
	persona6.setNombre(utilsCompanieros.tryCatchString(pregunta));
	companieros.add(persona1);
	companieros.add(persona2);
	companieros.add(persona3);
	companieros.add(persona4);
	companieros.add(persona5);
	companieros.add(persona6);
	for (Persona persona : companieros) {
		System.out.println(persona.getNombre());
	}
	
	
	
}
}
