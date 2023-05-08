package Alumnos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Modelo extends HashMap<Grupo, TreeMap<String, String>> {

	public Grupo grupoMenosProfesores()
	// Devuelve el grupo con menos profesores distintos. Si hay más de un
	// grupo con el mínimo de profesores, puede devolver cualquiera.
	{
		int min=100;
		Grupo grupo = null;
		for (Grupo g : this.keySet()) {
			TreeSet<String> conj = new TreeSet<>();
			conj.addAll(this.get(g).values());
			if (conj.size() < min) {
				min=conj.size();
				grupo = g;
			
			}
		}
		return grupo;
	}

	public LinkedList<Alumno> alumnosConAsignatura(String asignatura)
	// Devuelve una LinkedList<Alumno> con los alumnos que tienen la asignatura
	// dada, sin repetir alumnos en la LinkedList
	{
		LinkedList<Alumno> alumnosList = new LinkedList<>();
		TreeSet<Alumno> alumnos = new TreeSet<>();
		for (Grupo g : this.keySet())
			if (this.get(g).containsKey(asignatura))
				alumnos.addAll(g.getAlumnos());
		alumnosList.addAll(alumnos);
		return alumnosList;

	}

	public String profesorConMasAsignaturas()
	// Devuelve el nombre del profesor que imparte más asignaturas aunque sea la
	// misma en distintos grupos. Si hay más de uno, puede devolver cualquiera.
	{
		for (TreeMap<String, String> m : this.values())
			for (String asignatura : m.values())
				if(this.values().)
				return null;

	}

	public TreeSet<String> todasAsignaturas()
	// Devuelve un TreeSet con todas las asignaturas que se imparten en la academia
	{
		TreeSet<String> todasAsignaturas = new TreeSet<>();
		for (TreeMap<String, String> asignaturas : this.values())
			todasAsignaturas.addAll(asignaturas.keySet());

		return todasAsignaturas;

	}

	public HashMap<String, HashSet<Grupo>> gruposDeCadaProfesor()
	// Devuelve un mapa cuyas claves son los nombres de los profesores y el valor
	// asociado a cada profesor es un HashSet de todos los grupos donde imparte
	// alguna asignatura.
	{
		HashMap<String, HashSet<Grupo>> m = new HashMap<>();
		HashSet<Grupo> grup = new HashSet<>();
		for (Grupo g : this.keySet())
			for (TreeMap<String, String> asignaturas : this.values())
				for (String profesor : asignaturas.values()) {
					if (this.get(g).values().contains(profesor))
						grup.add(g);
					m.put(profesor, grup);
				}
		return m;

	}

}
