package ejemplo;

import examenJUnit.RepasoExamen;

public class Main {

    public static void main(String[] args) {

   	 System.out.print(contar(1,1));//Queremos pintar un cuadrado de tamaño 5
   	RepasoExamen.precioProducto(1001,true);
    }

/**
 * El siguiente metodo devuelve un String con los numeros que hay entre el parametro desde y hasta,
 * separados por comas,  por ejemplo 2,3,4.
 * Si no hay ningun número entre ambos números, devuelve la cadena vacía.
 *
 * @param desde indica el numero por el que se empieza a contar
 * @param hasta indica el numero hasta el que se quiere contar
 */
    public static String contar(int desde, int hasta) {
   	 String resultado="";
   	 for(int i=desde;i<=hasta-1;i++) {
   		 resultado+=i+",";
   	 }
   	 if(desde<=hasta)//En el caso de que hay nmumeros entre ambos parametros
   		 resultado+=hasta;
   	 return resultado;
    }
}


