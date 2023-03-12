package ExamenModelo;

public class Almacen {
	protected Estanteria[] estanteria = new Estanteria[5];
	private double precioBebidasEstanterias;
	private double precioBebidasAlmacen;

	public double obtenerPrecioBebidasAlmacen() {
		for (int i = 0; i < this.estanteria.length; i++) {
			precioBebidasAlmacen += estanteria[i].precioBebidasEstanteria;
		}
		return precioBebidasAlmacen;
	}

	public void agregarProducto() {
		for (int i = 0; i < this.estanteria.length; i++) {
			if (estanteria[i].bebida.equals(null)) {
			}
		}

	}

	public double obtenerPrecioBebidasEstanterias() {

		for (int i = 0; i < this.estanteria.length; i++) {
			precioBebidasEstanterias = estanteria[i].precioBebidasEstanteria;
		}
		return precioBebidasEstanterias;
	}

}
