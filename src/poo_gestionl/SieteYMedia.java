package poo_gestionl;

import poo_modelo.Carta2;

import javax.swing.JOptionPane;

public class SieteYMedia {

	public static void main(String[] args) {

		Carta2 carta = new Carta2();
		double sumaTotal = 0;
		boolean seguir = true;

		while (seguir) {
			int opcion = Integer.parseInt(
					JOptionPane.showInputDialog("Elija una opción:\n" + "1. Nueva carta\n" + "2. Plantarse\n"));
			switch (opcion) {
			case 1:
				carta = new Carta2();
				sumaTotal += carta.consultarTotal();
				JOptionPane.showMessageDialog(null, carta);
				JOptionPane.showMessageDialog(null, "Total acumulado: " + sumaTotal);
				if (sumaTotal > 7.5) {
					String respuesta = JOptionPane.showInputDialog(null,
							"Te has pasado, has perdido. ¿Quieres volver a jugar? (s/n)");
					if (!respuesta.equalsIgnoreCase("s")) {
						seguir = false;
					} else {
						sumaTotal = 0;
					}
				}
				break;
			case 2:
				carta = new Carta2();
				JOptionPane.showMessageDialog(null, "Has terminado el juego. La última carta es: " + carta);
				sumaTotal += carta.consultarTotal();
				JOptionPane.showMessageDialog(null, "Total acumulado: " + sumaTotal);
				if (sumaTotal <= 7.5) {
					JOptionPane.showMessageDialog(null, "Has ganado");
				} else {
					JOptionPane.showMessageDialog(null, "Has perdido");
				}
				String respuesta = JOptionPane.showInputDialog(null, "¿Quieres volver a jugar? (s/n)");

				if (!respuesta.equalsIgnoreCase("s")) {
					seguir = false;
				} else {
					sumaTotal = 0;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
			}
		}

	}
}
