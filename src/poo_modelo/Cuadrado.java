/**
 * 
 */
package poo_modelo;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Cuadrado implements IFigura {

	/**
	 * 
	 */
	private int lado;
	private String nombre="Cuadrado";
	

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double getArea(){
		return Math.pow(lado, 2);
	}

	
	public void pintarCuadrado(int lado) {
		char arribaLado = 0;
		char abajoLado = 0;
		
		this.lado=lado;	
		this.lado=lado;
		for (int i = 0; i < lado; i++) {
			arribaLado='*';
			abajoLado='*';
		}
		
		
			System.out.println(arribaLado+abajoLado);
	}

	@Override
	public String getNombreFigura() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
