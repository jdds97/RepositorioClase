import javax.swing.JOptionPane;

public class Simulador {

	public static void main(String[] args) {
		int eleccion;
		try {
		eleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea realizar" + "\n" + "1 - Dar de alta un Saltador"
				+"\n"+ "2 - Simular competicion" + "\n" + "3 - Ver estadísticas"));
		switch (eleccion) {
		case 1:{Saltador uno =new Saltador();
		}break;
		case 2:
		//simularCompeticion(uno);
		
		}
	}catch(NumberFormatException e) {
		
	};

}
}
