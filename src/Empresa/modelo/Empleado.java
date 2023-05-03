package Empresa.modelo;

import java.time.LocalDate;
import java.util.Objects;

import Empresa.src.interfaces.IEmpleado;

public class Empleado implements IEmpleado {
private String nombre;
private String apellidos;
private int edad;
private LocalDate fechaNacimiento;
public Empleado() {
	
}

@Override
public String getNombre() {
	return nombre;
}
@Override
public void setNombre(String nombre) {
	this.nombre=nombre;
}
@Override
public String getApellidos() {
	return apellidos;
}
@Override
public void setApellido(String apellido) {
	this.apellidos=apellido;
}
@Override
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
@Override
public void setFechaNacimiento(LocalDate fechaNacimiento) {
this.fechaNacimiento=fechaNacimiento;	
}
@Override
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public int hashCode() {
	return Objects.hash(apellidos, edad, nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Empleado other = (Empleado) obj;
	return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre);
}

@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", fechaNacimiento="
			+ fechaNacimiento + "]";
}


@Override
public int compareTo(IEmpleado o) {
	int numeroSaliente;
	if (this.edad == o.getEdad()) {
		numeroSaliente = 0;
	} else if (this.edad <o.getEdad()) {
		numeroSaliente = -1;
	} else {
		numeroSaliente = 1;
	}
	return numeroSaliente;		
}

}
