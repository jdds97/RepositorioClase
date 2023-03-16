/**
 * 
 */
package Examen2Modelo;

import javax.swing.JOptionPane;

import Examen2Modelo.ComicAmericano;
import Examen2Modelo.ComicClasico;
import Examen2Modelo.ComicEstandar;

/**
 * @author JesusDeDios
 *
 */
public class TiendaComics {

	static ComicClasico comicCreado;
	static boolean salir = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int eleccionPrincipal = 0;
		int eleccionComic = 0;
		int eleccionPrecio = 0;
		int eleccionITQ = 0;
		String eleccionTitulo = "";
		String eleccionSubtitulo = "";
		String eleccionGenero = "";
		String eleccionComicGenero = "";
		String eleccionComicIdRelevancia = "";

		ComicClasico[] comicClasico = new ComicClasico[100];
		do {
			do {
				try {
					eleccionPrincipal = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar?" + "\n"
							+ "1.Dar de alta un comic" + "\n" + "2.Listar los comics de un genero" + "\n"
							+ "3.Listar los comics cuyo nivel de relevancia esta por encima de la media" + "\n"
							+ "4.Salir"));
					salir = true;
				} catch (NumberFormatException e) {

					salir = false;
				}
			} while (!salir);
			switch (eleccionPrincipal) {

			case 1:
				do {

					try {

						eleccionComic = Integer
								.parseInt(JOptionPane.showInputDialog("¿Que tipo de comic quiere dar de alta?" + "\n"
										+ "1.Estandar" + "\n" + "2.Americano"));
						salir = true;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");

						salir=false;
					}

				} while (!salir);
				switch (eleccionComic) {
				case 1:

					for (int i = 0; i < comicClasico.length; i++) {

						if (comicClasico[i] == null) {
							resetearEstadisticas();
							comicClasico[i] = new ComicEstandar();
							comicCreado = comicClasico[i];
							i = 100;

						}

					}

					do {
						try {
							eleccionTitulo = JOptionPane.showInputDialog("¿Cual es el titulo?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir=false;
						}

					} while (!salir);
					comicCreado.setTitulo(eleccionTitulo);

					do {
						try {
							eleccionSubtitulo = JOptionPane.showInputDialog("¿Cual es el subtitulo?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir=false;
						}

					} while (!salir);
					comicCreado.setSubTitulo(eleccionSubtitulo);
					do {
						try {
							eleccionPrecio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el precio?"));
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir=false;
						}

					} while (!salir);
					comicCreado.setPrecio(eleccionPrecio);
					do {
						try {
							eleccionGenero = JOptionPane.showInputDialog("¿Cual es su genero?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir=false;
						}

					} while (!salir);
					comicCreado.setGenero(eleccionGenero);

					JOptionPane.showMessageDialog(null,
							"******************" + "Comic creado satisfactoriamente" + "******************");
					JOptionPane.showMessageDialog(null, comicCreado.toString());

					break;

				case 2:

					for (int i = 0; i < comicClasico.length; i++) {

						if (comicClasico[i] == null) {
							comicClasico[i] = new ComicAmericano();
							comicCreado = comicClasico[i];
							i =100;
							
						}
					}
					do {
						try {
							eleccionTitulo = JOptionPane.showInputDialog("¿Cual es el titulo?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");

						}
					} while (!salir);
					comicCreado.setTitulo(eleccionTitulo);

					do {
						try {
							eleccionSubtitulo = JOptionPane.showInputDialog("¿Cual es el subtitulo?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}

					} while (!salir);
					comicCreado.setSubTitulo(eleccionSubtitulo);
					do {
						try {
							eleccionPrecio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el precio?"));
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}

					} while (!salir);
					comicCreado.setPrecio(eleccionPrecio);
					do {
						try {
							eleccionGenero = JOptionPane.showInputDialog("¿Cual es su genero?");
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}

					} while (!salir);
					comicCreado.setGenero(eleccionGenero);

					do {
						try {
							eleccionITQ = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su American ITQ?"));
							salir = true;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}

					} while (!salir);
					comicCreado.setAmericanITQ(eleccionITQ);

					JOptionPane.showMessageDialog(null,
							"******************" + "Comic creado satisfactoriamente" + "******************");
					JOptionPane.showMessageDialog(null, comicCreado.toString());

					break;
				}
				break;
				
			case 2:

				do {
					try {
						eleccionComicGenero = JOptionPane.showInputDialog("Indica el genero".toLowerCase());
						salir = true;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
						salir = false;
					}
				} while (!salir);

				for (int i = 0; i < comicClasico.length; i++) {
					if (comicClasico[i].getGenero().equals(eleccionComicGenero)) {
						comicClasico[i].toString();
					} else {
						JOptionPane.showMessageDialog(null, "No hay ningun comic de dicho genero en el sistema");
						
					}

				}

				break;

			case 3:
				do {
					try {
						eleccionComicIdRelevancia = JOptionPane.showInputDialog("Indica el genero".toLowerCase());
						salir = true;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Dato mal introducido");
						salir=false;
					}
				} while (!salir);
				comicCreado.getIdRelevanciaComic(comicClasico);
				JOptionPane.showMessageDialog(null, "No implementado");
				// } else {
				JOptionPane.showMessageDialog(null, "No hay ningun comic de dicho genero en el sistema");

				salir = false;
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Hasta pronto");
				

				break;

			}
			comicCreado=null;

		} while (eleccionPrincipal != 4);
	}
	public static void resetearEstadisticas() {
		int eleccionPrincipal = 0;
		int eleccionComic = 0;
		int eleccionPrecio = 0;
		int eleccionITQ = 0;
		String eleccionTitulo = "";
		String eleccionSubtitulo = "";
		String eleccionGenero = "";
		String eleccionComicGenero = "";
		String eleccionComicIdRelevancia = "";
	}
}
