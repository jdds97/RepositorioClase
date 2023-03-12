package ExamenGestion;

import javax.swing.JOptionPane;


import ExamenModelo.Almacen;
import ExamenModelo.BebidaAzucarada;
import ExamenModelo.Marca;

public class MainExamen {
	static boolean salir;
	public static void main(String[] args) {
		
		
			
		
		String eleccionMenu;
		Almacen almacen = new Almacen();
		do {

			try {
				eleccionMenu = JOptionPane.showInputDialog(("¿Qué operación quiere realizar?" + "\n"
						+ "1.Calcular el precio de todas las bebidas" + "\n"
						+ "2.Calcular el precio total de una marca de bebida" + "\n"
						+ "3.Calcular el precio total de una estantería" + "\n" 
						+ "4.Agregar producto" + "\n"
						+ "5.Eliminar un producto" + "\n" 
						+ "6.Mostrar inventario" + "\n" 
						+ "7.Ampliar almacén"));
				switch (eleccionMenu) {
				case "1":
					almacen.obtenerPrecioBebidasAlmacen();
					JOptionPane.showMessageDialog(null,almacen.obtenerPrecioBebidasAlmacen());
					
					break;
				case "2":
					Marca una=new Marca();
					JOptionPane.showMessageDialog(null, "El precio total de la marca "+una.getNombre()+" es de "+almacen.getPrecioTotalMarca(una));
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, almacen.obtenerPrecioBebidasEstanterias());
					
					break;
				case"4":
					BebidaAzucarada pepsi=new BebidaAzucarada(0, 0, 0, 0, 0, una);
					almacen.agregarProducto(pepsi);
				break;
				case "5":
					
					almacen.eliminarProducto(pepsi);
					break;
				case "6":
					almacen.mostrarInventario();
				break;
				case "7":
					almacen.ampliarAlmacen();
				break;
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