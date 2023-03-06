package ejemplo;

public class Main4 {

	public static void main(String[] args) {
		System.out.println(siHayDiferenciaDeCincoEntre(3, 6));
	}

	/**
	 * Método que devuelve true si la distancia entre dos numeros es igual a 5
	 * 
	 * 
	 * @param inicio, valor menir del rango que se quiere comprobar.
	 * @param fin,    valor mayor del rango que se quiere comprobar.
	 * @return devuleve un booleano, que sera true si la distancia entre fin e
	 *         inicio es cinco.
	 */
	public static boolean siHayDiferenciaDeCincoEntre(int inicio, int fin) {
		int resta = fin - inicio;
		boolean resultado;
		if (resta == 5)
			resultado = true;
		else
			resultado = false;
		return resultado;
	}

}
