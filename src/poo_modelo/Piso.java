package poo_modelo;


public class Piso {
	public static final double IVA = 0.21;
	private int planta;
	private int numeroPuerta;
	private double precioBaseMensual;
	
	public Piso( int planta, int numeroPuerta, double precioBaseMensual) {
		this.planta = planta;
		this.numeroPuerta = numeroPuerta;
		this.precioBaseMensual = precioBaseMensual;
	}
	

	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}



	public int getNumeroPuerta() {
		return numeroPuerta;
	}
	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}
	public double getPrecioBaseMensual() {
		return precioBaseMensual;
	}
	public void setPrecioBaseMensual(double precioBaseMensual) {
		this.precioBaseMensual = precioBaseMensual;
	}
	public double getPrecioAlquiler() {
		return (this.getPrecioBaseMensual()*IVA)+getPrecioBaseMensual();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piso other = (Piso) obj;
		return numeroPuerta == other.numeroPuerta && planta == other.planta
				&& Double.doubleToLongBits(precioBaseMensual) == Double.doubleToLongBits(other.precioBaseMensual);
	}


	@Override
	public String toString() {
		return "Piso [planta=" + planta + ", numeroPuerta=" + numeroPuerta + ", precioBaseMensual=" + precioBaseMensual
				+ "]";
	}
	
	
	
}
