package poo_modelo;

public class Cliente {
	private final String DNI;
	private int edad;
	private String direccion;
	private String telefono;

	/**
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(String DNI, int edad, String direccion, String telefono) {
		this.DNI = DNI;

	}

	public String getDNI_Cliente() {
		return DNI;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
}
