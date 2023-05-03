package Empresa.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Empresa.src.interfaces.IEmpleado;
import Empresa.src.interfaces.IOficina;

public class Oficina implements IOficina {
private List<IEmpleado> empleados= new ArrayList<>();

@Override
public List<IEmpleado> getEmpleados() {
	return empleados;
}

@Override
public void setEmpleados(List<IEmpleado> empleados) {
	this.empleados=empleados;
}

@Override
public void addEmpleado(IEmpleado empleado) {
	this.empleados.add(empleado);
}

@Override
public boolean despedirEmpleado(String apellidos, String nombre) {
	boolean existe=false;
	for (IEmpleado iEmpleado : empleados) {
		if(iEmpleado.getNombre().equalsIgnoreCase(nombre)&& iEmpleado.getApellidos().equalsIgnoreCase(apellidos)) {
			empleados.remove(iEmpleado);
			existe=true;
		}
		else {
			existe=false;
		}
	}
	return existe;
}

@Override
public IEmpleado getEmpleadoMayorEdad() {
	Collections.sort(empleados,Collections.reverseOrder());
	return empleados.get(0);
}

}
