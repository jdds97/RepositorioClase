package poo_modelo;

public class Circulo implements IFigura{
	private double radio;
	private String nombre="Circulo";
	

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}


	@Override
	public double getArea() {
		return PI*Math.pow(radio, 2);
		
	}


	@Override
	public String getNombreFigura() {
		return nombre;
	}

}
