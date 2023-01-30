package poo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*int numeroLitros;

		Cubo cuboPorDefecto=new Cubo();
		Cubo cuboConParametro=new Cubo("pl�stico", false, "negro", 10, 0);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres llenar?"));
		cuboPorDefecto.llenarCubo(numeroLitros);
		numeroLitros=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos litros quieres vaciar?"));
		cuboPorDefecto.vaciarCubo(numeroLitros);
		cuboPorDefecto.setCapacidadActual(numeroLitros);
		cuboPorDefecto.pintarCubo(numeroLitros);
		cuboPorDefecto.mostrarCuboPintado(cuboPorDefecto.pintarCubo);
		JOptionPane.showMessageDialog(null, cuboConParametro);
		JOptionPane.showMessageDialog(null, "Hola me llamo "+pernombre);
		Cuadrado uno=new Cuadrado();
		uno.pintarCuadrado(5);*/
		Persona jesus=new Persona(" Jesus","de dios Sanchez",25,'M');
		jesus.saludar();
		JOptionPane.showMessageDialog(null, "Jesus tiene como sexo "+jesus.getSexo());
		Cuenta jesusito=new Cuenta("0000", 0.5,123456789,1200);
		JOptionPane.showMessageDialog(null, "El saldo de jesusito es "+jesusito.getSaldo());
		Cuenta alberto=new Cuenta("0000",0.8,123456781,12);
		jesusito.hacerTransferenciaA(alberto, 500);
		JOptionPane.showMessageDialog(null, "El saldo de jesusito es ahora de "+jesusito.getSaldo()+"y el de Alberto "+alberto.getSaldo());
	}

}
