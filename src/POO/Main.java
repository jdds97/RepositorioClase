package POO;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double numeroLitros;

		Cubo cuboPorDefecto=new Cubo();
		Cubo cuboConParametro=new Cubo("plástico", false, "negro", 10, 0);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos litros quieres llenar?"));
		cuboPorDefecto.llenarCubo(numeroLitros);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos litros quieres vaciar?"));
		cuboPorDefecto.vaciarCubo(numeroLitros);
		cuboPorDefecto.setCapacidadActual(numeroLitros);
	}

}
