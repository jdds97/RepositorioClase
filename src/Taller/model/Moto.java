package Taller.model;

import java.util.Objects;

import Taller.interfaces.IMoto;
import Taller.interfaces.Vehiculo;

public class Moto extends Vehiculo implements IMoto {
	
	private boolean tieneSidecar;
	
	public Moto() {
		   // TODO document why this constructor is empty
		 }
	
	@Override
	public void setTieneSidecar(Boolean tieneSidecar) {
		this.tieneSidecar=tieneSidecar;
	}

	@Override
	public Boolean getTieneSidecar() {
		return tieneSidecar;
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
		Moto other = (Moto) obj;
		return Objects.equals(getMatricula(), other.getMatricula());
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + getMatricula() + ", marca=" + getMarca() + ", tieneSidecar=" + tieneSidecar + "]";
	}

	@Override
	public int compareTo(IMoto o) {
		return this.getMatricula().compareTo(o.getMatricula());
	}



	
}
