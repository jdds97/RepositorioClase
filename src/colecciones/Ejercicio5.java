package colecciones;

import java.util.ArrayList;

import Examen2Modelo.Utils;

public class Ejercicio5 {

	public static void main(String[] args) {
		Utils Almacen = new Utils();
		Gestisimal almacen1=new Gestisimal(null, null, 0);
		do {
			
		boolean salir=false;
		String pregunta="¿Que quiere hacer?\n"+"1.Listado\n"+"2.Alta\n"+"3.Baja\n"+"4.Modificacion\n"+"5.Entrada de mercancía\n"+"6.Salida de mercancía \n"+"7.Salir\n";
		switch (Almacen.tryCatchInt(pregunta)) {
		case 1:
			System.out.println(almacen1);
			break;
		case 2:
			almacen1.add(null);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			setStock(+1);
			break;
		case 6:
			setStock(-1);
			break;
		case 7:
			salir=true;
			break;
		default:
			break;
		}
	}while(!salir);

}
}