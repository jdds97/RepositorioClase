package ExamenEntornos;

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
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
