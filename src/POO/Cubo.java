package POO;

import javax.swing.JOptionPane;

public class Cubo {
	private String material;
	private boolean asa;
	private String color;
	private double capacidad;
	private double capacidadActual;
	public Cubo(){
		this.material="plástico";
		this.asa=true;
		this.color="azul";
		this.capacidad=10;
		this.capacidadActual=0;
	}
	public Cubo(String material,boolean asa,String color,double capacidad,double capacidadActual){
		this.material=material;
		this.asa=asa;
		this.color=color;
		this.capacidad=capacidad;
		this.capacidadActual=capacidadActual;
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
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @param capacidadActual the capacidadActual to set
	 */
	public void setCapacidadActual(double capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	public void llenarCubo(double numeroLitros) {
		do {
			

		if (numeroLitros>=0 && numeroLitros<10) {
			this.capacidadActual+=numeroLitros;
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Introduzca cifra entre 0 y 10");
		}
		}while(numeroLitros<10);
		
	}
	public  void vaciarCubo(double numeroLitros) {
		do {
			if (numeroLitros>=0 && numeroLitros<10) {
				this.capacidadActual-=numeroLitros;
			}
			else {
				JOptionPane.showMessageDialog(null, "Introduzca cifra entre 0 y 10");
			}
			}while(numeroLitros<10);
			
	}
	public void pintarCubo(double numeroLitros) {
		if(numeroLitros>0 && numeroLitros<2) {
			JOptionPane.showMessageDialog(null, color);
		}
	}
	}

