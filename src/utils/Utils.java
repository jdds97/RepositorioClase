package utils;

import javax.swing.JOptionPane;

public class Utils {
	public String tryCatchString(String pregunta) {
		String eleccionTryString = null;
		boolean salirTryString = false;
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryString = JOptionPane.showInputDialog(pregunta).toLowerCase();

				// Si todo va bien sale del bucle y del metodo
				salirTryString = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Palabra mal introducida, vuelve a intentarlo");

			}
		} while (!salirTryString);
		// Devolvemos la entrada de datos como una cadena de texto
		return eleccionTryString;
	}

	/**
	 * Metodo que solicita al usuario un numero entero a traves de una ventana de
	 * dialogo, y que utiliza un bloque try-catch para evitar errores en caso de que
	 * el usuario introduzca un valor que no sea numerico.
	 * 
	 * @param pregunta El mensaje que se muestra al usuario para solicitar el
	 *                 numero.
	 * @return El número entero introducido por el usuario.
	 */
	public int tryCatchInt(String pregunta) {

		// Inicializacion de la variable que almacena el numero entero introducido por
		// el usuario.
		int eleccionTryInt = 0;
		// Variable que controla si se ha introducido un numero valido.
		boolean salirTryInt = false;

		// Bucle do-while para solicitar el numero hasta que se introduzca uno valido.
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryInt = Integer.parseInt(JOptionPane.showInputDialog(pregunta));
				if (eleccionTryInt > 5)
					salirTryInt = false;
				// Si todo va bien sale del bucle y del metodo
				salirTryInt = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "<html>" + "<div style=text-align:left>" + "Numero mal introducido"
						+ "<hr>" + "Vuelve a intentarlo con una de las opciones" + "</div>" + "</html>");

			}
		} while (!salirTryInt);
		// Se devuelve el numero entero introducido por el usuario.
		return eleccionTryInt;
	}
}

