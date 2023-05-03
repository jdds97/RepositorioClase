package colecciones;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
	private String nombre;
	private int sueldo;
	
	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado(String nombre, int sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado \n" + (nombre != null ? "nombre=" + nombre + "" : "") + "sueldo=" + sueldo + "\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sueldo);
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
		return sueldo == other.sueldo;
	}
	@Override
	public int compareTo(Empleado o) {
		int numeroSaliente;
		if (this.sueldo==o.sueldo) {
			numeroSaliente=0;
		}
		else if (this.sueldo<o.sueldo) {
			numeroSaliente=-1;
		}
		else {
			numeroSaliente=1;
		}
			return numeroSaliente;
		}
	
}
