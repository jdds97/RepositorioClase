package poo_modelo;

public class Rectangulo implements IFigura {
	private double radio;
	
		public Rectangulo(double radio) {
			
			this.radio = radio;
		}

	
		public
	@Override
	public double getArea() {
		double area;
		area=PI*Math.pow(radio, 2);
		return area;
		
	}



		/**
		 * @param radio
		 */
		
	

}
}
