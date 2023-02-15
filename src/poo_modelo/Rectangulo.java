package poo_modelo;

public class Rectangulo implements IFigura {
	private double base;
	private double altura;
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return base*altura ;
	}
	

	



		
	

}
