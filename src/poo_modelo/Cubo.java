package poo_modelo;

import javax.swing.JOptionPane;

public class Cubo {
	private String material;
	private boolean asa;
	private String color;
	private int capacidad;
	private int capacidadActual;
	char[][] pintarCubo;

	public Cubo() {
		this.material = "plastico";
		this.asa = true;
		this.color = "azul";
		this.capacidad = 10;
		this.capacidadActual = 0;
	}

	public Cubo(String material, boolean asa, String color, int capacidad, int capacidadActual) {
		this.material = material;
		this.asa = asa;
		this.color = color;
		this.capacidad = capacidad;
		this.capacidadActual = capacidadActual;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @return the asa
	 */
	public boolean isAsa() {
		return asa;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the capacidad
	 */
	public double getCapacidad() {
		return capacidad;
	}

	/**
	 * @return the capacidadActual
	 */
	public double getCapacidadActual() {
		return capacidadActual;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @param asa the asa to set
	 */
	public void setAsa(boolean asa) {
		this.asa = asa;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @param capacidadActual the capacidadActual to set
	 */
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public void llenarCubo(int numeroLitros) {
		do {

			if (numeroLitros >= 0 && numeroLitros < 10) {
				this.capacidadActual += numeroLitros;

			} else {
				JOptionPane.showMessageDialog(null, "Introduzca cifra entre 0 y 10");
			}
		} while (numeroLitros < 10);

	}

	public void vaciarCubo(int numeroLitros) {
		do {
			if (numeroLitros >= 0 && numeroLitros < 10) {
				this.capacidadActual -= numeroLitros;
			} else {
				JOptionPane.showMessageDialog(null, "Introduzca cifra entre 0 y 10");
			}
		} while (numeroLitros < 10);

	}

	public void pintarCubo(int numeroLitros) {
	
		pintarCubo = new char[10][7];
		for (int i = 0; i < pintarCubo.length; i++) {
			for (int j = 0; j < pintarCubo.length; j++) {
				pintarCubo[9][j] = 'X';
				pintarCubo[j][0]='X';
				pintarCubo[j][0]='X';
			}
		}
		if (numeroLitros > 0 && numeroLitros <= 2 && capacidadActual == 0) {
			JOptionPane.showMessageDialog(null, color);
			for (int i1 = 0; i1 < pintarCubo.length; i1++) {
				for (int j = 0; j < pintarCubo.length; j++) {
					pintarCubo[8][j] = 'X';
					pintarCubo[7][j] = 'X';
				}
			}
		}
		if (numeroLitros > 2 && numeroLitros <= 4 && capacidadActual == 0) {
			JOptionPane.showMessageDialog(null, color);
			for (int i2 = 0; i2 < pintarCubo.length; i2++) {
				for (int j = 0; j < pintarCubo.length; j++) {
					pintarCubo[8][j] = 'X';
					pintarCubo[7][j] = 'X';
					pintarCubo[6][j] = 'X';
					pintarCubo[5][j] = 'X';
				}
			}
		}
		if (numeroLitros > 4 && numeroLitros <= 6 && capacidadActual == 0) {
			JOptionPane.showMessageDialog(null, color);
			for (int i3 = 0; i3 < pintarCubo.length; i3++) {
				for (int j = 0; j < pintarCubo.length; j++) {
					pintarCubo[8][j] = 'X';
					pintarCubo[7][j] = 'X';
					pintarCubo[6][j] = 'X';
					pintarCubo[5][j] = 'X';
					pintarCubo[4][j] = 'X';
					pintarCubo[3][j] = 'X';
				}
			}
		}
		if (numeroLitros > 6 && numeroLitros <= 8) {
			JOptionPane.showMessageDialog(null, color);
			for (int i4 = 0; i4 < pintarCubo.length; i4++) {
				for (int j = 0; j < pintarCubo.length; j++) {
					pintarCubo[8][j] = 'X';
					pintarCubo[7][j] = 'X';
					pintarCubo[6][j] = 'X';
					pintarCubo[5][j] = 'X';
					pintarCubo[4][j] = 'X';
					pintarCubo[3][j] = 'X';
					pintarCubo[2][j] = 'X';

				}

			}
		}
		if (numeroLitros > 8 && numeroLitros <= 10) {
			JOptionPane.showMessageDialog(null, color);
			for (int i5 = 0; i5 < pintarCubo.length; i5++) {
				for (int j = 0; j < pintarCubo.length; j++) {
					pintarCubo[8][j] = 'X';
					pintarCubo[7][j] = 'X';
					pintarCubo[6][j] = 'X';
					pintarCubo[5][j] = 'X';
					pintarCubo[4][j] = 'X';
					pintarCubo[3][j] = 'X';
					pintarCubo[2][j] = 'X';
					
					
				}
			}
		}
	}
	public static void mostrarCuboPintado(char[][]pintarCubo){
	char capacidad = 0;
	for(int i=0;i<pintarCubo.length;i++) {
		for(int j=0;j<pintarCubo.length;j++) {
			capacidad=pintarCubo[i][j];
	}
	}
	System.out.println(capacidad);
	}
}
