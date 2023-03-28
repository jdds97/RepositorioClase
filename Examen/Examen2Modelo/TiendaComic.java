package Examen2Modelo;

import javax.swing.JOptionPane;


/**
 * En esta clase crearemos los diferentes comics con sus diferentes acciones que
 * pedira de un menu para su creacion
 * 
 * @author Jesus de Dios
 *
 */
public class TiendaComic {
	// Array de los 100 comics clasicos con una longitud de 100 comics
	ComicClasico[] comicsClasicos;
	// Creamos un comic estatico para que coja los metodos y diferentes getters y
	// setters
	// de ComicClasico para que TiendaComic pueda hacer las diferentes acciones que
	// pide el programa

	/**
	 * Constructor vacio de tienda de comics con los 100 comics por crear en el menu
	 * de CreacionTiendaComic
	 */
	public TiendaComic() {
		this.comicsClasicos = new ComicClasico[100];
	}

	/**
	 * 
	 * @param comicCreado
	 */
	public void setComic(ComicClasico comic) {

		for (int i = 0; i < comicsClasicos.length && comicsClasicos[i] == null; i++) {

			comicsClasicos[i] = comic;
		}

	}
	public ComicClasico getComic() {
		ComicClasico comicEncontrado = null;
		boolean encontrado=false;
		for (int i = 0; i < comicsClasicos.length && !encontrado; i++) {
			if(comicsClasicos[i]!=null) {
				comicEncontrado =comicsClasicos[i];
				encontrado=true;
			}
		}
		return comicEncontrado;
	}

	/**
	 * En este metodo segun sea el genero va comparando si el genero de el comic en
	 * esa posicion es el que hemos pasado ,y si es asi muestra sus datos ,y si no
	 * con el else mostrariamos un mensaje de que no hay comics con ese genero
	 * 
	 * @param genero
	 */
	public void listaComicsPorGenero(String genero) {
		for (int i = 0; i < comicsClasicos.length ; i++) {
			if (comicsClasicos[i]!=null && comicsClasicos[i].getGenero().equals(genero)) {
				JOptionPane.showMessageDialog(null, comicsClasicos[i].toString());
			}

			else {

				JOptionPane.showMessageDialog(null, "No hay ningun comic de dicho genero en el sistema");
			}

		}
	}

	/**
	 * @return Retorna el nivel de Relevancia Medio a través de los niveles de
	 *         relevancia de cada comic que se van sumando en el array y estos
	 *         dividiendo por el numero de comic que hay en la tienda.
	 */

	public double getNivelRelevanciaMedioComics() {
		ComicClasico comicMedia = this.comicsClasicos[0];
		double nivelRelevanciaMedio;
		for (int i = 0; i < comicsClasicos.length && comicsClasicos[i] != null; i++) {
			if(this.comicsClasicos[0]!=null && comicsClasicos[i].getNivelDeRelevancia()>comicMedia.getNivelDeRelevancia())
				comicMedia=comicsClasicos[i];
			

		}
		nivelRelevanciaMedio = comicMedia.getNivelDeRelevancia() / comicsClasicos.length;
		return nivelRelevanciaMedio;
	}
	
	/**
	 * Metodo para calcular el comic que esta por encima de la media
	 */
	public void getListaComicMenorALaMedia() {
		for (int i = 0; i < comicsClasicos.length && !(comicsClasicos[i] == null); i++) {
			if (comicsClasicos[i].getNivelDeRelevancia() > getNivelRelevanciaMedioComics()) {

				JOptionPane.showMessageDialog(null, comicsClasicos[i].toString());
			}

			else {

				JOptionPane.showMessageDialog(null, "El comic tiene mayor  el numero medio de relevancia");
			}

		}
	}

	@Override
	public String toString() {
		return getComic().toString();
	}

}
