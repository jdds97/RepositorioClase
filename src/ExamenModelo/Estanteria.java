package ExamenModelo;

public class Estanteria {
	protected int id = (int) Math.random() * 100 + 1;
	protected Bebida[] bebida;
	protected double precioBebidasEstanteria;

	public Estanteria(Bebida[] bebida) {
		this.bebida =bebida;
	}
	public int getIdBebida() {
		for (int i = 0; i < bebida.length;) {
			
		
		return bebida[i].id;
	}
		return id;
	}
}
