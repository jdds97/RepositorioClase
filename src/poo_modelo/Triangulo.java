package poo_modelo;

public class Triangulo implements IFigura{
	private double base;
	private double altura;
	private String nombre="Triangulo";
	/**
	 * @param base 
	 * @param base
	 * @param altura 
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return base*altura/2;
	}
	@Override
	public String getNombreFigura() {
		return nombre;
	}
	
}
