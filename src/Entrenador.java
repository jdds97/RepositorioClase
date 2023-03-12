
public class Entrenador extends Persona{
		private int numeroColegiado;


	public Entrenador(String nombre,String apellidos,Nacionalidades nacionalidad,int numeroColegiado) {
		super( nombre,apellidos, nacionalidad);
		this.numeroColegiado=numeroColegiado;
	}


	/**
	 * @return the numeroColegiado
	 */
	public int getNumeroColegiado() {
		return numeroColegiado;
	}


	/**
	 * @param numeroColegiado the numeroColegiado to set
	 */
	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

}
