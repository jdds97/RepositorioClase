package examenJUnit;


/**
 * Situar la clase para que funcione en el paquete examenJUnit.
 * La siguienet clase tiene metodos de juguete, 
 * ha sido implementada para practicar con JUnit.
 * 
 * @author Raul SG
 * @version 1.1
 *
 */
public class UtilChorra {
	public final static String SALUDO_GENERICO="Hola ";
	public final static String SALUDO_TARDE="Buenas tardes ";


	/**
	 * Se debe:
	 *  - Identificar las clases de equivalencia del siguiente metodo 
	 *  - Definir el menor numero de casos de pruebas necesario para probar las clases
	 *  de equivalencia detectadas. Aplica para una de ellas la tecnica de los valores limites.
	 *  - Implementar los casos de pruebas en Junit.
	 *  
	 * Descripcion del metodo:
	 * El siguiente metodo, tiene como objetivo, generar un String para saludar
	 * a una persona, segun la hora del dia.
	 * 
	 *  Si el parametro nombrePersona es null, se considerara un dato invalido
	 *  y el metodo devuelve null. 
	 *  El parametro hora se considerara invalido si no esta comprendido entre 0 (incluido) y 24 (no incluido), y
	 *  en tal caso, el programa devolvera null.
	 *  Para el resto de casos:
	 *   - Si hora esta comprendido en el rango [12 - 20) el metodo devolvera la cadena "Buenas tardes "+nombrePersona
	 *   - Para el resto de horas validas,  el metodo devolvera la cadena "Hola "+nombrePersona  
	 * 
	 * Entradas: hora, nombrePersona
	 * Salidas: String
	 * 
	 * @param hora: Entero que representa la hora del dia en la que se quiere saludar, debe ser un valor en el rango [0 - 24) 
	 * @param nombrePersona: Nombre de pila de la persona a la que se quiere saludar. Se considerara valido cualquier tipo
	 * de String distinto de null.
	 * 
	 * @return String - saludo.
	 */
	public static String saludarPersona(int hora, String nombrePersona) {
		String saludo;
		if(nombrePersona==null) {
			saludo=null;
		}
		else {
			if(hora>=12 && hora<20) {//Tramo para saludar con Buenas Tardes
				saludo=SALUDO_TARDE+nombrePersona;
			}
			else {
				if((hora>=0 && hora<12) || (hora>=20 && hora <24)) {//Tramos para saludar con Hola
					saludo=SALUDO_GENERICO+nombrePersona;
				}
				else {//Para el resto de casos
					saludo=null;
				}
			}
		}
		return saludo;
	}


	
	/**
	 * Se debe:
	 *  - Indicar para el metodo su complejidad ciclomatica
	 *  - implementar el minimo numero de test para probar el siguiente metodo
	 *  cubriendo todos los caminos independientes (cobertura de caminos)
	 *  
	 * Descripcion del metodo:
	 * El siguiente metodo, tiene como objetivo, calcular la potencia.
	 * 
	 *  
	 *  Si exponente es igual a cero, independientemente del valor de la base, el metodo
	 *  va a devolver 1. Para el resto de casos, el metodo va a devolver base^exponente
	 *  (base elevado a exponente)
	 * 
	 * Entradas: base, exponente
	 * Salidas: double
	 * 
	 * @param base: Factor que se va a multiplicar las veces que indique el exponente
	 * @param exponente: valor que indica el numero de veces que se multiplica la base. 
	 * Si es un valor negativo, indica el numero de veces que se divide 1 entre la base.
	 * 
	 * @implNote El metodo se podria implementar de forma mas eficiente.
	 * 
	 * @return double - resultado de base^exponente.
	 */
	public static double potenciaConBucles(double base, int exponente) {
		double resultado=1;
		if(exponente>0) {//En el caso de tener un exponente positivo
			resultado=base;
			for(int i=1;i<exponente;i++) {
				resultado*=base;
			}
		}
		if(exponente<0) {//En el caso de tener un exponente negativo
			resultado=1/base;
			for(int i=1;i<Math.abs(exponente);i++) {//Mientras i sea menor al valor absoluto del exponente
				resultado/=base;
			}
		}
		return resultado;
	}


}