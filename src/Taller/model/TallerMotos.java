package Taller.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import Taller.interfaces.IMoto;
import Taller.interfaces.ITallerMotos;

public class TallerMotos implements ITallerMotos {
	private Map<String, IMoto> registroMotos = new HashMap<>();

	public TallerMotos() {

	}

	@Override
	public void entrarMoto(IMoto moto) {
		registroMotos.put(moto.getMatricula(), moto);
	}

	@Override
	public boolean pintarColor(String matricula, String color) {
		boolean colorCambiado = false;
		if (registroMotos.get(matricula) != null) {
			registroMotos.get(matricula).setColor(color);
			colorCambiado = true;
		}
		return colorCambiado;
	}

	@Override
	public void borrarMoto(String matricula) {
		if (registroMotos.get(matricula) != null)
			registroMotos.remove(matricula);

	}

	@Override
	public void instalarSidecar(String matricula) {
		if (registroMotos.get(matricula) != null)
			registroMotos.get(matricula).setTieneSidecar(true);
	}

	@Override
	public int hashCode() {
		return Objects.hash(registroMotos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TallerMotos other = (TallerMotos) obj;
		return Objects.equals(registroMotos, other.registroMotos);
	}

	@Override
	public String toString() {
		return "TallerMotos [registroMotos=" + registroMotos + "]";
	}

}
