/**
 * 
 */
package POO;

/**
 * @author Jesús De Dios.R4
 *
 */
public class Cuadrado {

	/**
	 * 
	 */
	private int lado;
	private int area=lado*lado;

	public Cuadrado() {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	public void pintarCuadrado(int lado) {
		char arribaLado;
		char abajoLado;
		char resultado = 0;
		this.lado=lado;	
		this.area=area;
		for (int i = 0; i < lado; i++) {
			arribaLado='*';
			abajoLado='*';;
		}
		
		
			System.out.println(arribaLado+abajoLado);
	}

}
