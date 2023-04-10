package colecciones;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			empleados.add(new Empleado(JOptionPane.showInputDialog("Dime el nombre del empleado"),Integer.parseInt(JOptionPane.showInputDialog("Dime el sueldo del empleado"))));
		}
		Collections.sort(empleados);
		for (Empleado empleado : empleados) {
			JOptionPane.showMessageDialog(null, empleado.toString());
		}
		System.out.println(empleados);
	}

}
