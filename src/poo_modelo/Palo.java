package poo_modelo;

import javax.swing.JOptionPane;

public class Palo {

	public enum palo{UNO(1),DOS(2),TRES(3),CUATRO(4), CINCO(5),SEIS(6),SIETE(7),SOTA(10),CABALLO(11),REY(12);

	palo(enum palo) {
		i=Integer.parseInt(JOptionPane.showInputDialog("dime "));
System.out.println(i);	}}
}
