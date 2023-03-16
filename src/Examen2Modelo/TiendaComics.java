/**
 * 
 */
package Examen2Modelo;

import javax.swing.JOptionPane;

/**
 * @author JesusDeDios
 *
 */
public class TiendaComics {
	static String eleccionStringTry;
	static String eleccionStringInt;
	static String eleccionString = "";
	static int eleccionInt;
	static boolean salir = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TiendaComic tienda1 = new TiendaComic();
		do {

			eleccionStringInt = "¿Que desea realizar?" + "\n" + "1.Dar de alta un comic" + "\n"
					+ "2.Listar los comics de un genero" + "\n"
					+ "3.Listar los comics cuyo nivel de relevancia esta por encima de la media" + "\n" + "4.Salir";
			tryCatchInt();
			switch (eleccionInt) {

			case 1:
				eleccionStringInt = "¿Que tipo de comic quiere dar de alta?" + "\n" + "1.Estandar" + "\n"
						+ "2.Americano";
				tryCatchInt();
				switch (eleccionInt) {
				case 1:
					tienda1.crearComicEstandar();

					eleccionString = "¿Cual es el titulo?";

					tryCatchString();
					tienda1.getComicCreado().setTitulo(eleccionStringTry);

					eleccionString = "¿Cual es el subtitulo?";
					tryCatchString();
					tienda1.getComicCreado().setSubTitulo(eleccionStringTry);
					eleccionStringInt = "¿Cual es el precio?";
					tryCatchInt();

					tienda1.getComicCreado().setPrecio(eleccionInt);

					eleccionString = "¿Cual es su genero?";
					tryCatchString();
					tienda1.getComicCreado().setGenero(eleccionStringTry);

					JOptionPane.showMessageDialog(null,
							"******************" + "Comic creado satisfactoriamente" + "******************");
					JOptionPane.showMessageDialog(null, tienda1.getComicCreado().toString());

					break;

				case 2:
					tienda1.crearComicAmericano();

					eleccionString = "¿Cual es el titulo?";

					tienda1.getComicCreado().setTitulo(eleccionStringTry);

					eleccionString = "¿Cual es el subtitulo?";

					tienda1.getComicCreado().setSubTitulo(eleccionStringTry);

					eleccionStringInt = "¿Cual es el precio?";
					tryCatchInt();
					tienda1.getComicCreado().setPrecio(eleccionInt);

					eleccionString = "¿Cual es su genero?";
					tryCatchString();
					tienda1.getComicCreado().setGenero(eleccionStringTry);

					eleccionStringInt = "¿Cual es su American ITQ?";
					tryCatchInt();
					tienda1.getComicCreado().setAmericanITQ(eleccionInt);

					JOptionPane.showMessageDialog(null,
							"******************" + "Comic creado satisfactoriamente" + "******************");
					JOptionPane.showMessageDialog(null, tienda1.getComicCreado().toString());

					break;
				}
				break;

			case 2:

				eleccionString = "Indica el genero".toLowerCase();
				tryCatchString();
				tienda1.listaComicsPorGenero(eleccionStringTry);

				break;

			case 3:
				
				tienda1.getListaComicMayorALaMedia();
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Hasta pronto");

				break;

			}
			tienda1.setComicCreado(null);

		} while (eleccionInt != 4);
	}

	public static void tryCatchString() {
		do {
			try {

				eleccionStringTry = JOptionPane.showInputDialog(eleccionString);
				eleccionString = null;
				salir = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Dato mal introducido");
				salir = false;
			}
		} while (!salir);
	}

	public static void tryCatchInt() {
		do {
			try {

				eleccionInt = Integer.parseInt(JOptionPane.showInputDialog(eleccionStringInt));
				eleccionStringInt = null;
				salir = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Dato mal introducido");
				salir = false;
			}
		} while (!salir);
	}
}
