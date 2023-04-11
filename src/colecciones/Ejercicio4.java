package colecciones;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		//Añadimos con un bucle 4 empleados
		for (int i = 0; i < 4; i++) {
			empleados.add(new Empleado(JOptionPane.showInputDialog("Dime el nombre del empleado"),Integer.parseInt(JOptionPane.showInputDialog("Dime el sueldo del empleado"))));
		}
		//Ordenado
		Collections.sort(empleados);
		System.out.println(empleados);
		//Desordenado
		Collections.sort(empleados,Collections.reverseOrder());
		System.out.println(empleados);
	}

}
