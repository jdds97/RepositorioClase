package HollyWood.bin.modelo;

import java.util.Objects;

import HollyWood.src.interfaces.IPelicula;

public class Pelicula implements IPelicula {
private String nombre;
private int oscars;
public Pelicula() {
	
}
/**
 * @return the oscars
 */
@Override
public int getNumeroOscars() {
	return oscars;
}
@Override
/**
 * @param oscars the oscars to set
 */
public void setNumeroOscars(int numeroOscar) {
	this.oscars = numeroOscar;
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
public int hashCode() {
	return Objects.hash(nombre, oscars);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pelicula other = (Pelicula) obj;
	return Objects.equals(nombre, other.nombre) && oscars == other.oscars;
}
@Override
public int compareTo(IPelicula o) {
	int numeroSaliente;
	if (this.oscars == o.getNumeroOscars()) {
		numeroSaliente = 0;
	} else if (this.oscars <o.getNumeroOscars()) {
		numeroSaliente = -1;
	} else {
		numeroSaliente = 1;
	}
	return numeroSaliente;		
}
/*
 * CompareTo para poner criterio por nombre de pelicula
@Override
public int compareTo(IPelicula o){
  return this.nombre.compareTo(o.getNombre());
  }
  */
 


}
