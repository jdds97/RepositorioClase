package poo_modelo;

import javax.swing.JOptionPane;

public class MainSimulador {

	public static void main(String[] args) {
		int eleccion = 0;
		boolean salir=true;
		do {
		try {
			
		eleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "�Qu� desea realizar" + "\n" + "1 - Dar de alta un Saltador"
					+"\n"+ "2 - Simular competicion" + "\n" + "3 - Ver estad�sticas"));
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Opci�n insertada inv�lida,pruebe de nuevo con n�meros");
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
