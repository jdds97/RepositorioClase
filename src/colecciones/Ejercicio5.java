package colecciones;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Examen2Modelo.Utils;


public class Ejercicio5 {

	public static void main(String[] args) {
		Utils Almacen = new Utils();
		Almacen almacen1=new Almacen();
		
		boolean salir=false;
		do {
			
		
		String pregunta="¿Que quiere hacer?\n"+"1.Listado\n"+"2.Alta\n"+"3.Baja\n"+"4.Modificacion\n"+"5.Entrada de mercancía\n"+"6.Salida de mercancía \n"+"7.Salir\n";
		String preguntaClave="Dime la clave del producto";
		switch (Almacen.tryCatchInt(pregunta)) {
		case 1:
			System.out.println(almacen1.getProductos().values());
			break;
		case 2:
			Articulo añadido = null;
			almacen1.addProductos(añadido);
			break;
		case 3:
			almacen1.eliminarProductos(Almacen.tryCatchInt(preguntaClave));
			break;
		case 4:
			Articulo modificado = null;
			almacen1.modificarProductos(Almacen.tryCatchInt(preguntaClave),modificado);
			break;
		case 5:
			almacen1.entradaMercancia(Almacen.tryCatchInt(preguntaClave));
			break;
		case 6:
			almacen1.salidaMercancia(Almacen.tryCatchInt(preguntaClave));
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