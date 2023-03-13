package ExamenModelo;

public class Marca {
	protected String nombre;
	protected Bebida bebida;
	public Marca(String marca) {
		this.nombre = marca;
	}

	/**
	 * @return the bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}

	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
