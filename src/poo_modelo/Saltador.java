package poo_modelo;

import java.util.Objects;

public class Saltador {
	private String nombre;
	private String apellidos;
	private Nacionalidad nacionalidad;
	private Entrenador entrenador;
	private Salto[] saltos;
	
	

	public Saltador(String nombre, String apellidos, Entrenador entrenador, Nacionalidad nacionalidad) {
		this.saltos = new Salto[5];//null
		for (int i = 0; i < this.saltos.length; i++) {
			this.saltos[i] = new Salto();//sin parametros 
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.entrenador = entrenador;
		this.setNacionalidad(nacionalidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	/**
	 * @return the nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saltador other = (Saltador) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nacionalidad, other.nacionalidad)
				&& Objects.equals(nombre, other.nombre);
	}

	public void intercambiarEntrenador(Saltador saltador, Entrenador entrenador) {
		if ((!saltador.equals(null)) && (!entrenador.equals(null))) {
			if ((!saltador.equals(this)) && !(saltador.entrenador.equals(this.entrenador))) {
				saltador.entrenador = this.entrenador;
				this.entrenador = entrenador;
			}
		}
	}
	public int getPuntosTotalCompeticion(){
		for (int i = 0; i < saltos.length; i++) {
			for (int j = 0; i < saltos[i].getSalto().length; j++) {
			//this.saltos[i].getSaltoPuntuacionIndividual()=this.saltos[i].getSalto()[j].getMejorPuntuacionSalto()-this.saltos[i].getSalto()[j].getPeorPuntuacionSalto()
			}
		}
		
		
		return 5;
		
	}

}
