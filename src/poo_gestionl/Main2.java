package poo_gestionl;
import poo_modelo.Piratagochi;
import javax.swing.JOptionPane;

import poo_modelo.Piratagochi;

public class Main2 {

	public static void main(String[] args) {
		/*Persona jesus=new Persona();
		Persona alberto=new Persona();
		Coche jesus1=new Coche();
		Perro perro1=new Perro("Husky","Pepe", 10, true, false);
		JOptionPane.showMessageDialog(null, perro1);
		JOptionPane.showMessageDialog(null, resultado);*/
		Piratagochi jesus =new Piratagochi();
	}
		public void menu() {
			boolean finalizado = false;
			do {

				String eleccion = JOptionPane.showInputDialog("Que quieres hacer con "+"\n" + "1.Dormir\n" + "2.Jugar\n"
						+ "3.Comer\n" + "4.Mirar necesidades\n" + "5.Salir\n");
				switch (eleccion) {
				case "1":
					//dormir(energia);
					break;
				case "2":
					//jugar(energia);
					break;
				case "3":
					//comer();
					break;
				case "4":
					//getNecesidades();
					break;
				case "5":
					JOptionPane.showMessageDialog(null, "Hasta pronto");
					finalizado = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta");

					break;
				}
			} while (!finalizado);
		
	}

}
