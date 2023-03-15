package poo_modelo;

import javax.swing.JOptionPane;

public class MainSimulador {

	public static void main(String[] args) {
		int eleccion = 0;
		boolean salir=true;
		do {
		try {
			
		eleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea realizar" + "\n" + "1 - Dar de alta un Saltador"
					+"\n"+ "2 - Simular competicion" + "\n" + "3 - Ver estadísticas"));
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Opción insertada inválida,pruebe de nuevo con números");
		salir=false;
		}
		switch (eleccion) {
		case 1:
			
			break;
		case 2:

			break;
		case 3:
			break;
		}
		
		} while (!salir);
	}

}
