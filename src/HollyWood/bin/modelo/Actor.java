package HollyWood.bin.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import HollyWood.src.interfaces.IActor;
import HollyWood.src.interfaces.IPelicula;

public class Actor implements IActor {
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private List<IPelicula> peliculasActor = new ArrayList<>();
	public Actor() {
   // TODO document why this constructor is empty
 }
	
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public void addPelicula(IPelicula pelicula) {
		this.peliculasActor.add(pelicula);
	}

	@Override
	public int getOscars() {
		int numeroOscarsActor=0;
		for (IPelicula iPelicula : peliculasActor) {
			numeroOscarsActor+=iPelicula.getNumeroOscars();
		}
		return numeroOscarsActor;
	}

}
