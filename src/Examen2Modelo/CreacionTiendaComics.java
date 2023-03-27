/**
 * 
 */
package Examen2Modelo;

import javax.swing.JOptionPane;

/**
 * @author Jesus de Dios
 *En esta clase crearemos  tiendas de comics con su distinguido menu para saber los diferentes atributos de comics
 *de los que contiene dichas tiendas
 */
public class CreacionTiendaComics {
	/*
	 * Creamos las variables estaticas de String e int para que conforme vayan pasando las preguntas se
	 *  vayan sobreescribiendo tanto en las preguntas como en los metodos try catch que mas adelante mencionaremos
	 * 
	 */
	static String eleccionStringTry;
	static String eleccionStringInt;
	static String eleccionString;
	static int eleccionInt;
	
	/**
	 * Esta variable boolean nos servira para utilizarla en el bucle del menu principal y en los diferentes 
	 * try catch para que vaya avanzando o volviendose a producir su bucle al introducir un dato invalido
	 * 
	 */
	static boolean salir = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Primero creamos la tienda con el array ya creado de 100 posiciones
		TiendaComic tienda1 = new TiendaComic();
		
	