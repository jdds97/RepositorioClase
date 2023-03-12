package ExamenModelo;

import java.util.Random;

public class Almacen {
	protected Estanteria[] estanteria;
	protected BebidaAzucarada[] bebidasAzucaradas;
	protected Agua[] agua;
	protected String[] nombresRefrescos;
	protected Marca marca;
	private double precioBebidasEstanterias;
	private double precioBebidasAlmacen;
	Random random = new Random();
	private int probabilidadAguaORefresco;

	public Almacen() {
		this.estanteria = new Estanteria[5];
		this.bebidasAzucaradas = new BebidaAzucarada[6];
		this.agua = new Agua[6];
		for (int i = 0; i < this.estanteria.length; i++) {
			probabilidadAguaORefresco = random.nextInt(2);
			switch (probabilidadAguaORefresco) {
			case 0: {
				this.estanteria[i] = new Estanteria(this.bebidasAzucaradas);
			}
				break;
			case 1: {
				this.estanteria[i] = new Estanteria(this.agua);
			}
				break;

			}
		}

	}

	public double obtenerPrecioBebidasAlmacen() {
		for (int i = 0; i < this.estanteria.length; i++) {
			precioBebidasAlmacen += estanteria[i].precioBebidasEstanteria;
		}
		return precioBebidasAlmacen;
	}

	public void agregarProducto(Bebida bebida) {
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

	public double getPrecioTotalMarca(Marca marca) {
		return marca.bebida.getPrecioFinal();
	}

	public void eliminarProducto(int id) {
		
		for (int i = 0; i < this.estanteria.length; i++) {
			if(id==estanteria[i].bebida.) {
				
			}
		}
		
	}



}
