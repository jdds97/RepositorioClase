package poo_modelo;

import javax.swing.JOptionPane;

public class Segurata extends Cerrojo {

	/**
	 * @param cLAVE
	 */
	protected Segurata(String cLAVE,Cerrojo estado) {
		super(cLAVE);
		if (cLAVE.equals("123")) {
			super.estado = true;
			super.CLAVE=JOptionPane.showInputDialog("Dime la nueva clave");
		}
		else {
			super.estado=false;
		}
	}

}
