/**
 * 
 */
package poo_gestionl;



import javax.swing.JOptionPane;


import poo_modelo.RelojAnal�gico;
import poo_modelo.RelojDigital;

/**
 * @author Jesus de Dios
 *
 */
public class MainReloj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RelojDigital AppleWatch=new RelojDigital();
		RelojAnal�gico Casio=new RelojAnal�gico();
		JOptionPane.showMessageDialog(null, Casio.mostrarHora());
		JOptionPane.showMessageDialog(null, AppleWatch.mostrarHora());
		AppleWatch.activarAlarma(10,30);
		JOptionPane.showMessageDialog(null, AppleWatch.getHoraAlarma());
	}

}
