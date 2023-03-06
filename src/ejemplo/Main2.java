package ejemplo;

public class Main2 {

	public static void main(String[] args) {

		System.out.println(contarVocales("qw"));
	}

	/**
	 * Método que devuelve como resultado el numero de vocales que contiene
	 * nombreCompleto
	 * 
	 * @param nombreCompleto String, que es utilizada como un parámetro de entrada,
	 *                       de la cual se va a contabilizar el número de vocales
	 *                       que contiene.
	 * @return int número de vocales que contiene el parámetro de entrada
	 *         nombreCompleto
	 */
	public static int contarVocales(String nombreCompleto) {
		// Declaración de variables
		int numeroVocales = 0;// Iniciamos a cero el numero de vocales que hemos encontrado
		int numeroCaracteresNombreCompleto = nombreCompleto.length() - 1;// numeroCaracteresNombreCompleto contiene el
																			// numero de caracteres
		// de nombreCompleto, teniendo en cuenta que empieza por cero, por eso -1.
		for (int i = 0; i <= numeroCaracteresNombreCompleto; i++) {// Recorremos todos los caracteres de nombreCompleto,
			// empezando por el primero
			char caracter = nombreCompleto.charAt(i);// Obtenemos el caracter que está en la posición i
			if (esVocal(caracter)) {// En el caso de que sea vocal
				numeroVocales++;// Incrementamos numero vocales
			}
		}
		return numeroVocales;// Devolvemos el resultado
	}

	/**
	 * Método privado que devuelve si caracter es una vocal o no. No tiene en cuenta
	 * vocales con acentuaciones
	 *
	 * @param caracter parámetro de entrada, del cual se va a determinar si es una
	 *                 vocal o no.
	 * @return boolean devuelve false, si caracter no es una vocal, y true en el
	 *         caso contrario.
	 */
	private static boolean esVocal(char caracter) {
		int index = "AEIOUaeiou".indexOf(caracter);// Obtenemos en qué posición se encuentra
		// caracter, en el string "AEIOUaeio". En caso de no encontrarse, indexOf
		// devuelve -1
		return index != -1;// Devolvemos un boolean que será true si caracter se encontraba en la cadena
		// "AEIOUaeio", false en caso contrario.

	}

}
