package Examen3ºEvaluacion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Examen3ºEvaluacion.interfaces.IFoto;
import Examen3ºEvaluacion.interfaces.IHashtag;

public class Foto implements IFoto {
	// Declaramos las variables que nos piden retornar en los diferentes metodos de
	// la interfaz inicializando todos los atributos
	private String path = "";
	private List<IHashtag> hashtag = new ArrayList<>();

	// Creamos el constructor vacio para despues settear sus atributos si fuera
	// necesario
	public Foto() {
		// TODO
	}
	// Al implementar la interfaz IFoto debemos implementar el metodo compareTo()
	// que contiene la
	// interfaz ya que esta interfaz extiende de la clase Comparable con el tipo
	// <IFoto>,entonces este compareTo()
	// se sobreescribe en esta clase que implementa como los demas metodos.

	@Override
	public int compareTo(IFoto o) {
		// Declaramos e inicializamos una variable de tipo int para utilizar mas
		// adelante para el orden
		int numeroSaliente;
		// Aqui estamos diciendo que si el numero de la lista de hashtag de esta foto y
		// otra son iguales ,la variable
		// saliente sea 0 y por lo tanto la IFoto o se pondra a la derecha de esta
		if (this.getNumeroHashtag() == o.getNumeroHashtag()) {
			numeroSaliente = 0;
			// En este if condicionamos que si el numero de hashtag de esta foto es menor a
			// el numero de hashtag de otra foto
			// ,la variable retornara -1 poniendo a esta foto hacia la izquierda de la otra
			// foto en la lista
		} else if (this.getNumeroHashtag() > o.getNumeroHashtag()) {
			numeroSaliente = -1;
			// En este if condicionamos que si el numero de hashtag de esta foto entonces es
			// mayor a el numero de hashtag de otra foto
			// ,la variable retornara 1 poniendo a esta foto hacia la derecha de la otra
			// foto en la lista
		} else {
			numeroSaliente = 1;
		}
		// Retornamos el valor segun haya sido la comparacion del metodo
		return numeroSaliente;

	}

	@Override
	public String getPath() {
		return path;
	}

	@Override
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void addHashtag(IHashtag hashtag) {
		this.hashtag.add(hashtag);
	}

	@Override
	public boolean hasHashtag(IHashtag hashtag) {
		// Declaramos la variable a devolver a false
		boolean contiene = false;
		// Si la lista de hashtag de esta foto contiene el hashtag pasado como parametro
		// entonces devolvera true
		if (this.hashtag.contains(hashtag))
			contiene = true;
		// Si no la contiene la variable ya de por si esta inicializada a false ,por lo
		// tanto no entrara
		// en el if y retornara el valor de false
		return contiene;
	}

	@Override
	public int getNumeroHashtag() {
		// Declaramos la variable a retornar a 0
		int numHashtag = 0;
		// Si la lista de hashtag de esta foto no esta vacia ,entonces el
		// numHashtag(numero de Hashtags) sera
		// igual a la longitud de la lista de hashtag de esta foto
		if (!this.hashtag.isEmpty())
			numHashtag = this.hashtag.size();
		// Si esta vacia ,la variable al estar declarada al principio en el metodo a 0
		// ,devolvera 0 ya que no
		// entra en el if.
		return numHashtag;
	}

	/**
	 * @return the hastag
	 */
	
	public List<IHashtag> getHashtag() {
		return hashtag;
	}

	/**
	 * @param hastag the hastag to set
	 */
	
	public void setHastag(List<IHashtag> hastag) {
		this.hashtag = hastag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(path);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foto other = (Foto) obj;
		return Objects.equals(path, other.path);
	}

	@Override
	public String toString() {
		return "Foto [" + (path != null ? "path=" + path + ", " : "") + (hashtag != null ? "hashtag=" + hashtag : "")
				+ "]";
	}

}
