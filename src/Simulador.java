import javax.swing.JOptionPane;

public class Simulador {

	public static void main(String[] args) {
		int eleccion;
		do {
		try {
			
		eleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "�Qu� desea realizar" + "\n" + "1 - Dar de alta un Saltador"
				+"\n"+ "2 - Simular competicion" + "\n" + "3 - Ver estad�sticas"));
		switch (eleccion) {
		case 1: {
			Entrenador entrenador=new Entrenador(null, null, null, eleccion);
			Saltador saltador = new Saltador("Saltador1","Plaza",Nacionalidades.fromNombrePais("Espa�a"), entrenador);
		}break;
		

		case 2:
			if(!entrenador.equals(null)&& !saltador.equals(null) )
		Competicion competicion=new Competicion(saltador,entrenador,saltador.saltos);
		
		}
	}catch(NumberFormatException e) {
		
	};

}
}
