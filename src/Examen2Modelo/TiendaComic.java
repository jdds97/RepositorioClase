package Examen2Modelo;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TiendaComic {
	ComicClasico[] comicsClasicos = new ComicClasico[100];
	static ComicClasico comicCreado;

	public ComicClasico getComicCreado() {
		return comicCreado;
	}

	public void setComicCreado(ComicClasico comicCreado) {
		TiendaComic.comicCreado = comicCreado;
	}

	public TiendaComic() {

	}

	public void crearComicEstandar() {
		for (int i = 0; i < comicsClasicos.length && comicCreado == null; i++) {

			if (comicsClasicos[i] == null) {
				comicsClasicos[i] = new ComicEstandar();
				comicCreado = comicsClasicos[i];
			}

		}
	}

	public void crearComicAmericano() {
		for (int i = 0; i < comicsClasicos.length && comicCreado == null; i++) {

			if (comicsClasicos[i] == null) {
				comicsClasicos[i] = new ComicEstandar();
				comicCreado = comicsClasicos[i];
			}

		}
	}

	public void listaComicsPorGenero(String genero) {
		for (int i = 0; i < comicsClasicos.length && !(comicsClasicos[i] == null); i++) {
			if (comicsClasicos[i].getGenero().equals(genero)) {

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
		double nivelRelevanciaMedio = 0;
		for (int i = 0; i < comicsClasicos.length && !(comicsClasicos[i] == null); i++) {
			this.comicsClasicos[i].setNivelRelevanciaMedio(comicsClasicos[0].getNivelDeRelevancia());
			nivelRelevanciaMedio += comicsClasicos[i].getNivelRelevanciaMedio();

		}
		nivelRelevanciaMedio = nivelRelevanciaMedio / comicsClasicos.length;
		return nivelRelevanciaMedio;
	}

	/**
	 * Metodo para calcular el comic que esta por encima de la media
	 */
	public void getListaComicMayorALaMedia() {
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
		return  getComicCreado().toString();
	}
	
}
