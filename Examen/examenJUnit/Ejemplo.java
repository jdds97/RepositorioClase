package examenJUnit;

public class Ejemplo {
	
		

		 /** El procedimiento devuelve el String factor elevado a exponente, 
			 * con el siguiente formato: factor^exponent. Si el exponente es 1, solo se
			 * mostrara factor. Adicionalmente, si number no es 1, se añade el simbolo de multiplicacion
			 * al final, ya que no se trata del ultimo resultado. 
			 * Por ejemplo, printFactor(2, 3,4) , devuelve la cadena "2^3*"
			 * 
			 * En el caso en que exponent es menor o igual a cero, no se devuelve nada.
			 * Entrada: int factor, int exponent, int number
			 * Salida: Ninguna
			 */
			public static String printFactor(int factor, int exponent,int number) {
				String resultado="";
				if(exponent>=1) {//Si el exponente es mayor que uno, hay que imprimir el resultado
					resultado+=factor;
					if(exponent>1) {//Si el exponente es mayor que uno, hay que indicar el exponente
						resultado+="^"+exponent;
					}
					if(number>1) {//Si number no es uno, el numero se va a seguir descomponiendo
						resultado+="*";//Se añade un signo de multiplicacion a la derecha
					}
				}
				
				return resultado;
			}


	}

