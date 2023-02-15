/**
 * 
 */
package poo_gestionl;



import javax.swing.JOptionPane;



import poo_modelo.RelojAnalogico;
import poo_modelo.RelojDigital;

/**
 * @author Jesus de Dios
 *
 */
public class MainReloj {

	/**
	 * @param Metodo main creando los relojes
	 */
	public static void main(String[] args) {
		//Creacion de objetos
		RelojDigital AppleWatch=new RelojDigital();
		RelojAnalogico Casio=new RelojAnalogico();
		
		
		//Mostrar hora de los dos relojes
		JOptionPane.showMessageDialog(null, Casio.mostrarHora());
		JOptionPane.showMessageDialog(null, AppleWatch.mostrarHora());
		
		
		//Activamos la alarma 
		AppleWatch.activarAlarma(10,30);
		JOptionPane.showMessageDialog(null, AppleWatch.getHoraAlarma());
	}

}
