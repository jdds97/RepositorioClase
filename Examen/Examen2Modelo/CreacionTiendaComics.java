/**
 * 
 */
package Examen2Modelo;


/**
 * @author Jesus de Dios
 *En esta clase crearemos  tiendas de comics con su distinguido menu para saber los diferentes atributos de comics
 *de los que contiene dichas tiendas
 */
public class CreacionTiendaComics {

	public static void main(String[] args) {
		//Primero creamos la tienda con el array ya creado de 100 posiciones
		TiendaComic tienda1 = new TiendaComic();
		Utils utilsTienda=new Utils();
		utilsTienda.menuPrincipal(tienda1);
	}
}