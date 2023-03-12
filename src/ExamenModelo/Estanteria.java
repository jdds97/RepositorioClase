package ExamenModelo;

public abstract class Estanteria {
	protected int id=(int)Math.random()*100+1;
	protected Bebida[] bebida=new Bebida[6];
	protected double precioBebidasEstanteria;
	public Estanteria(int id, Bebida[] bebida) {
		this.id = id;
		this.bebida = bebida;
	}
	public double obtenerPrecioBebidasEstanterias() {
		for(int i=0;i<this.bebida.length;i++) {
			precioBebidasEstanteria+=bebida[i].precioFinal;
		}
	return precioBebidasEstanteria;
	}
}
