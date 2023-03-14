
package examenJUnit;

/**
 * Situar la clase para que funcione en el paquete examenJUnit. La siguiente
 * clase tiene metodos de juguete, ha sido implementada para practicar con
 * JUnit.
 *
 * @author Raul SG
 * @version 1.0
 *
 */
public class RepasoExamen {
	/**
     * Se debe:
     *  - Identificar las clases de equivalencia del siguiente metodo
     *  - Definir el menor numero de casos de pruebas necesario para probar las clases
     *  de equivalencia detectadas. Aplica para una de ellas la tecnica de los valores limites.
     *  - Implementar los casos de pruebas en Junit.
     *  
     * Descripcion del método:
     * El siguiente metodo, tiene como objetivo, devolver el precio final de un producto.
     *
     *  Si el parametro precio base es negativo, el valor es invalido, y el método devuelve null.
     *  Si el precio base es superior a 1000€, se aplica un descuento del 10% sobre el precio base
     *  Si ticket oferta es true, se aplica al precio resultante un descuento de un 10%.
     *  Si es false, no se aplica dicho descuento.
     *
     * Entradas: precioBase, oferta
     * Salidas: precioFinal
     *
     * @param precioBase: Double que representa el precio final del producto. Se considera valor valido si es mayor o igual a cero.
     * @param ticketOferta: Booleano, que indica si se aplica un descuento de un 10%.
     *
     * @return Double - precioFinal.
     */
	
    public static Double precioProducto(double precioBase, Boolean ticketOferta) {
   	 Double resultado=null;
   	 if(precioBase>=0)//Si el precio base es un valor positivo
   		 resultado=precioBase;
   	 if(precioBase>1000)//Si se aplica el descuento por superar 1000€
   		 resultado=resultado*0.9;
   	 if(ticketOferta)//Si ticketOferta es true
   		 resultado=resultado*0.9;//Se apliac el desvcuento del 10%
   	 return resultado;

    }
}
