package ExamenModelo;

public class Marca {
	protected String nombre;
	protected Bebida bebida;
	
	public Marca(String marca,Bebida bebida) {
		this.nombre=marca;
		this.bebida=bebida;
	}
	public String getNombre() {
		return nombre;
	}
	public Bebida getBebida() {
		return this.bebida;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

