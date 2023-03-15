/**
 * 
 */
package Examen2Gestion;



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
		int eleccionITQ=0;
		String eleccionTitulo = "";
		String eleccionSubtitulo = "";
		String eleccionGenero = "";
		String eleccionComicGenero = "";
		String eleccionComicIdRelevancia = "";
		

		ComicClasico[] comicClasico = new ComicClasico[100];

		do {
			try {
				eleccionPrincipal = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea realizar?" + "\n"
						+ "1.Dar de alta un cómic" + "\n" + "2.Listar los cómics de un género" + "\n"
						+ "3.Listar los cómics cuyo nivel de relevancia está por encima de la media" + "\n"
						+ "4.Salir"));
			} catch (NumberFormatException e) {
				
				salir = false;
			}
			salir = true;
		} while (!salir);
		do {
			switch (eleccionPrincipal) {

			case 1:
				try {

					eleccionComic = Integer.parseInt(JOptionPane.showInputDialog(
							"¿Qué tipo de comic quiere dar de alta?" + "\n" + "1.Estandar" + "\n" + "2.Americano"));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
					salir = false;
				}

				switch (eleccionComic) {
				case 1:

					for (int i = 0; i < comicClasico.length; i++) {

						if (comicClasico[i] == null) {
							comicClasico[i] = new ComicEstandar();
							comicCreado = comicClasico[i];
							i = 100;

						}

					}
					do {
						try {
							eleccionTitulo = JOptionPane.showInputDialog("¿Cuál es el titulo?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setTitulo(eleccionTitulo);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionSubtitulo = JOptionPane.showInputDialog("¿Cuál es el subtitulo?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setSubTitulo(eleccionSubtitulo);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionPrecio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el precio?"));
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setPrecio(eleccionPrecio);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionGenero = JOptionPane.showInputDialog("¿Cuál es su genero?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setGenero(eleccionGenero);
						salir = true;
					} while (!salir);

					break;

				case 2:
					for (int i = 0; i < comicClasico.length; i++) {

						if (comicClasico[i] == null) {
							comicClasico[i] = new ComicAmericano();
							comicCreado = comicClasico[i];
							i = comicClasico.length-comicClasico[i].getId();

						}
					}
					do {
						try {
							eleccionTitulo = JOptionPane.showInputDialog("¿Cuál es el titulo?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setTitulo(eleccionTitulo);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionSubtitulo = JOptionPane.showInputDialog("¿Cuál es el subtitulo?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setSubTitulo(eleccionSubtitulo);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionPrecio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el precio?"));
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setPrecio(eleccionPrecio);
						salir = true;
					} while (!salir);
					do {
						try {
							eleccionGenero = JOptionPane.showInputDialog("¿Cuál es su genero?");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
						comicCreado.setGenero(eleccionGenero);
						salir=true;					
					} while (!salir);
					
					do {
						try {
							eleccionITQ = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es su American ITQ?"));
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Dato mal introducido intente de nuevo");
							salir = false;
						}
					comicCreado.setAmericanITQ(eleccionITQ);
					salir=true;
					} while (!salir);

					JOptionPane.showMessageDialog(null,
							"******************" + "Comic creado satisfactoriamente" + "******************");
					comicCreado.toString();
					salir = false;

				}
				break;

			case 2:
				do {
					try {
						eleccionComicGenero = JOptionPane.showInputDialog("Indica el genero".toLowerCase());
					} catch (Exception e) {

					}
					for (int i = 0; i < comicClasico.length; i++) {
						if (comicClasico[i].getGenero().equals(eleccionComicGenero)) {
							comicClasico[i].toString();
						} else {
							JOptionPane.showMessageDialog(null, "No hay ningún comic de dicho genero en el sistema");
						}
					}
					salir = true;
				} while (!salir);
				salir = false;
				break;
			case 3:
				do {
					try {
						eleccionComicIdRelevancia = JOptionPane.showInputDialog("Indica el genero".toLowerCase());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Dato mal introducido");
					}
					
						
						
						JOptionPane.showMessageDialog(null, "No implementado");
						//} else {
							JOptionPane.showMessageDialog(null, "No hay ningún comic de dicho genero en el sistema");
						
					
				
					salir = true;
				} while (!salir);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hasta pronto");
				salir = true;
			}
			break;

		} while (!salir);
	}
}
