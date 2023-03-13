package ExamenModelo;

public class Estanteria {
	protected int id = (int) Math.random() * 100 + 1;
	protected Bebida[] bebida;
	protected double precioBebidasEstanteria;
	protected static int idBebida;
	

	public Estanteria(Bebida[] bebida) {
		this.bebida =bebida;
	}
	public int getIdBebidaEstanteria() {
		for (int i = 0; i < bebida.length;i++) {
		idBebida=bebida[i].id;
		}
		return idBebida;
	}
	public double getPrecioBebidasEstanteria() {
		for (int i = 0; i < bebida.length; i++) {
			precioBebidasEstanteria+=bebida[i].precioFinal;
		}
		return precioBebidasEstanteria;
		
	};
}
