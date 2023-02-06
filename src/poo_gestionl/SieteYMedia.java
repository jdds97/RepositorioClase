package poo_gestionl;

import poo_modelo.Carta2;

import javax.swing.JOptionPane;

public class SieteYMedia {
	
	static double sumaTotal = 0;
	/**
	 * <h1 style=color:aquamarine>Método Main</h1>
	 * <p>Muestra los resultados del juego</p>
	 * <hr>
	 * @param args
	 */
	public static void main(String[] args) {
		// Creamos una nueva carta y definimos las variables para el bucle
		Carta2 carta = new Carta2();
		
		boolean seguir = true;
		//Hacemos un bucle para que tenga en cuenta cuando quiera sacar mas cartas
		do {
			int opcion = Integer.parseInt(
					JOptionPane.showInputDialog("Elija una opcion:\n" + "1. Nueva carta\n" + "2. Plantarse\n"));
			switch (opcion) {
			case 1:
				carta = new Carta2();
				sumaTotal += carta.consultarTotal();
				JOptionPane.showMessageDialog(null, carta);
				JOptionPane.showMessageDialog(null, "Total acumulado: " + sumaTotal);
				if (sumaTotal > 7.5) {
					String respuesta = JOptionPane.showInputDialog(null,
							"Te has pasado, has perdido.\n "+"¿Quieres volver a jugar?\n"+"Si\n"+"No\n");
					if (!respuesta.equalsIgnoreCase("si")) {
						seguir = false;
					} else {
						sumaTotal = 0;
					}
				}
				break;
			case 2:
				carta = new Carta2();
				JOptionPane.showMessageDialog(null, "Has terminado el juego. La ultima carta es: " + carta);
				sumaTotal += carta.consultarTotal();
				JOptionPane.showMessageDialog(null, "Total acumulado: " + sumaTotal);
				if (sumaTotal <= 7.5) {
					JOptionPane.showMessageDialog(null, "Has ganado");
				} else {
					JOptionPane.showMessageDialog(null, "Has perdido");
				}
				String respuesta = JOptionPane.showInputDialog(null, "¿Quieres volver a jugar?"+"Si\n"+"No\n");

				if (!respuesta.equalsIgnoreCase("s")) {
					seguir = false;
				} else {
					sumaTotal = 0;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion invalida");
				break;
			}
		} while (seguir);
	}

}
