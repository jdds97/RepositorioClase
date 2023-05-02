package model;

import interfaces.IUsuario;
import interfaces.IValoracion;

public class Valoracion implements IValoracion{
	private String comentario;
	@Override
	public String getComentario() {
		// TODO Auto-generated method stub
		return this.comentario;
	}

	@Override
	public void setComentario(String comentario) {
		this.comentario=comentario;
	}

	@Override
	public int getPuntuacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPuntuacion(int puntuacion) throws PuntuacionInvalidaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IUsuario getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsuario(IUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

}	
