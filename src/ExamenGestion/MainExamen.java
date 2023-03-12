package ExamenGestion;

import javax.swing.JOptionPane;

import ExamenModelo.Almacen;
import ExamenModelo.Marca;

public class MainExamen {



	public static void main(String[] args) {
		String eleccionMenu;
		boolean salir = false;
		Almacen almacen=new Almacen();
		Marca marca=new Marca();
		do {
			
		
		try {
			eleccionMenu=JOptionPane.showInputDialog(				
					("�Qu� operaci�n quiere realizar?"+"\n"
					+"1.Calcular el precio de todas las bebidas"+"\n"
					+"2.Calcular el precio total de una marca de bebida"+"\n"
					+"3.Calcular el precio total de una estanter�a"+"\n"
					+"4.Agregar producto"+"\n"
					+"5.Eliminar un producto"+"\n"
					+"6.Mostrar inventario"+"\n"
					+"7.Ampliar almac�n"));
			switch (eleccionMenu) {
			case "1":
					almacen.obtenerPrecioBebidasAlmacen();
				break;
			case "2":
				
					JOptionPane.showMessageDialog(null, marca.getBebida().getPrecioFinal());
			case "3":
					almacen.obtenerPrecioBebidasEstanterias();
			default:
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		} while (!salir);

}
}