package POO;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int numeroLitros;

		Cubo cuboPorDefecto=new Cubo();
		Cubo cuboConParametro=new Cubo("pl�stico", false, "negro", 10, 0);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres llenar?"));
		cuboPorDefecto.llenarCubo(numeroLitros);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres vaciar?"));
		cuboPorDefecto.vaciarCubo(numeroLitros);
		cuboPorDefecto.setCapacidadActual(numeroLitros);
		JOptionPane.showMessageDialog(null, cuboConParametro);
	}

}
