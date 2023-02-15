package poo_gestionl;

import javax.swing.JOptionPane;


import poo_modelo.Cuenta;

public class MainCuenta {
	
	public static void main(String[] args) {
		Cuenta jesus=new Cuenta( "74", 0.15,1123456789, 500);
		Cuenta alberto=new Cuenta("74", 0.15,1123456789, 0);
		jesus.hacerTransferenciaA(alberto, 400);
		
		JOptionPane.showMessageDialog(null,jesus.getSaldo());
		JOptionPane.showMessageDialog(null,alberto.getSaldo());
		
	}

	

}
