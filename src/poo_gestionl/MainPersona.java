package poo_gestionl;

import javax.swing.JOptionPane;

import poo_modelo.SuperHeroe;

public class MainPersona {

	public static void main(String[] args) {
		SuperHeroe jesus=new SuperHeroe("Jesus", "de Dios", null, 'm');
		jesus.setPoder("Volar");
		JOptionPane.showMessageDialog(null, jesus.getNombre()+" puede "+jesus.getPoder());
	}

}
