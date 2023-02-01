package poo_gestionl;

import javax.swing.JOptionPane;

public class Main3 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, restar(4, 5));
	}

	public static int restar(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	public static boolean mayorDeEdad(int edad) {
		boolean mayorEdad = false;

		if (edad >= 18) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}
		return mayorEdad;
	}

}
