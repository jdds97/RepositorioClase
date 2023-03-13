package ExamenModelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Almacen {
	protected Estanteria[] estanterias;
	protected BebidaAzucarada[] bebidasAzucaradas;
	protected Agua[] agua;
	protected Marca marca;
	private double precioBebidasEstanterias;
	private double precioBebidasAlmacen;
	Random random = new Random();
	private int probabilidadAguaORefresco;

	public Almacen() {
		this.estanterias = new Estanteria[5];
		this.bebidasAzucaradas = new BebidaAzucarada[6];
		for (int i = 0; i < bebidasAzucaradas.length; i++) {
			this.bebidasAzucaradas[i]=new BebidaAzucarada(0, 0, 0.0,0.0,new Marca(nombreMarca, this.bebidasAzucaradas[i]));
		}
		this.agua = new Agua[6];
		for (int i = 0; i < agua.length; i++) {
			this.agua[i]=new Agua(0, 0, 0, 0, new Marca(agua[i].nombreMarca,this.agua[i]),agua[i].nombresAgua,agua[i].nombreSeleccionado, null);
		}
		

		for (int i = 0; i < this.estanterias.length; i++) {
			probabilidadAguaORefresco = random.nextInt(2);
			switch (probabilidadAguaORefresco) {
			case 0: {
				this.estanterias[i] = new Estanteria(this.bebidasAzucaradas);
			}
				break;
			case 1: {
				this.estanterias[i] = new Estanteria(this.agua);
			}
				break;

			}
		}

	}
	public Almacen(int numeroEstanterias) {
		this.estanterias = new Estanteria[5];
		this.bebidasAzucaradas = new BebidaAzucarada[6];
		this.agua = new Agua[6];
		for (int i = 0; i < this.estanterias.length; i++) {
			probabilidadAguaORefresco = random.nextInt(2);
			switch (probabilidadAguaORefresco) {
			case 0: {
				this.estanterias[i] = new Estanteria(this.bebidasAzucaradas);
			}
				break;
			case 1: {
				this.estanterias[i] = new Estanteria(this.agua);
			}
				break;

			}
		}

	}

	public double obtenerPrecioBebidasAlmacen() {
		for (int i = 0; i < this.estanterias.length; i++) {
			precioBebidasAlmacen += estanterias[i].precioBebidasEstanteria;
		}
		return precioBebidasAlmacen;
	}

	public void agregarProducto(Bebida bebida) {
		for (int i = 0; i < this.estanterias.length; i++) {
			for (int j = 0; j < this.bebidasAzucaradas.length; j++) {
				for (int k=0; k<this.agua.length;k++) {
					if ((!estanterias[i].bebida.equals(null)&& !(estanterias[i].getIdBebidaEstanteria()==(bebida.getId())))) {
						
					}
				}
				
			}
			
		}

	}

	public double obtenerPrecioBebidasEstanterias() {

		for (int i = 0; i < this.estanterias.length; i++) {
			precioBebidasEstanterias = estanterias[i].precioBebidasEstanteria;
		}
		return precioBebidasEstanterias;
	}

	public double getPrecioTotalMarca(Marca marca) {
		for (int i = 0; i < this.estanterias.length; i++) {
			for (int j = 0; j < this.bebidasAzucaradas.length; j++) {
				for (int k=0; k<this.agua.length;k++) {
					if ((!estanterias[i].bebida.equals(null)&& !(estanterias[i].getIdBebidaEstanteria()==(marca.getId())))) {
						
					}
				}
				
			}
		}
		return precioBebidasAlmacen;
			
		
	}

	public void eliminarProducto(int id) {
		
		for (int i = 0; i < this.estanterias.length; i++) {
			if(id==estanterias[i].getIdBebidaEstanteria()) {
				estanterias[i].bebida=null;
			}
		}
		
	}

	public void mostrarInventario() {
		for (int i = 0; i < estanterias.length; i++) {
			JOptionPane.showMessageDialog(null, estanterias[i].bebida.toString());
		}
	}

	public void ampliarAlmacen(int numeroEstanterias) {
		if(!this.estanterias.equals(null)) {
			new Almacen(numeroEstanterias);
		}
		
	}



}
