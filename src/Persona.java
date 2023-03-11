
public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	enum Nacionalidades {
		ESP,GBR,USA,PRT
	};
	protected Nacionalidades nacionalidad;
	public Persona(String nombre, String apellidos,Nacionalidades nacionalidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}
	public boolean equals(Saltador saltador) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
