package RepasoExamenModelo;

public class Estanteria {
	protected int id = (int) Math.random() * 100 + 1;
	protected Bebida[] bebida;
	protected double precioBebidasEstanteria;
	private Marca marca;
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
	public Marca obtenerMarca() {
		for (int i = 0; i < bebida.length; i++) {
			precioBebidasEstanteria+=bebida[i].precioFinal;
		
		this.setMarca(bebida[i].marca);
		}
		return this.getMarca(this.marca);
	}
	public Marca getMarca(Marca marca) {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	/**
	 * @return the bebida
	 */
	public Bebida[] getBebida() {
		return bebida;
	}
	/**
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida[] bebida) {
		this.bebida = bebida;
	}
	
	
}
