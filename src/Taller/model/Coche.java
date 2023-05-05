package Taller.model;

import java.util.Objects;

import Taller.interfaces.ICoche;
import Taller.interfaces.Vehiculo;

public class Coche extends Vehiculo implements ICoche {
	
	private boolean tieneRemolque;
	public Coche() {
   // TODO document why this constructor is empty
 }
	
	@Override
	public void setTieneRemolque(Boolean tieneRemolque) {
		this.tieneRemolque = tieneRemolque;
	}

	@Override
	public Boolean getTieneRemolque() {
		return tieneRemolque;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMatricula());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(getMatricula(), other.getMatricula());
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + getMatricula() + ", marca=" + getMarca() + ", color=" + getColor() + ", tieneRemolque="
				+ tieneRemolque + "]";
	}

	@Override
	public int compareTo(ICoche o) {
		return this.getMatricula().compareTo(o.getMatricula());
	}
	
}
