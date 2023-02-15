package poo_modelo;

public class Circulo implements IFigura{
	private double radio;
	

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

}
